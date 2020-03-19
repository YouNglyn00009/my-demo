package com.lyn.portal.handler;

import com.lyn.common.common.ApiResponse;
import com.lyn.common.exception.ParamErrorException;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

/**
 * @Description
 */
public class ProcessExceptionHandler {


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ApiResponse parameterMissingExceptionHandler(MissingServletRequestParameterException e) {
        return ApiResponse.ofFail("请求参数 " + e.getParameterName() + " 不能为空");
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ApiResponse parameterBodyMissingExceptionHandler(HttpMessageNotReadableException e) {
        return ApiResponse.ofFail("请求参数不能为空");
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiResponse parameterExceptionHandler(MethodArgumentNotValidException e) {

        BindingResult exceptions = e.getBindingResult();
        if (exceptions.hasErrors()) {
            List<ObjectError> allErrors = exceptions.getAllErrors();
            if (!allErrors.isEmpty()) {
                FieldError fieldError = (FieldError) allErrors.get(0);
                return ApiResponse.ofFail(fieldError.getField());
            }
        }
        return ApiResponse.ofFail();
    }




    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ParamErrorException.class)
    public ApiResponse paramExceptionHandler(ParamErrorException e) {
        if (!StringUtils.isBlank(e.getMessage())) {
            return ApiResponse.ofFail(e.getMessage());
        }
        return ApiResponse.ofFail("参数校验失败");
    }
}
