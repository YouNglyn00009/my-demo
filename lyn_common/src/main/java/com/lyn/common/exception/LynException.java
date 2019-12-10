package com.lyn.common.exception;

/**
 * @Description
 */
public class LynException extends RuntimeException {

    public LynException() {
    }

    public LynException(String message) {
        super(message);
    }

    public LynException(String message, Throwable cause) {
        super(message, cause);
    }

    public LynException(Throwable cause) {
        super(cause);
    }
}
