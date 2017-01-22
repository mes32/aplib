package com.github.mes32.aplib.exception;

public class InvalidNumericPrecisionException extends Exception {
    public InvalidNumericPrecisionException() {
        super();
    }

    public InvalidNumericPrecisionException(String message) {
        super(message);
    }

    public InvalidNumericPrecisionException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNumericPrecisionException(Throwable cause) {
        super(cause);
    }
}