package com.lyn.common.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description
 */
@Data
public class ApiRequest<T> implements Serializable {

    private static final long serialVersionUID = -2728952522935644790L;

    private String fromApp;

    private String userName;

    private T data;

}
