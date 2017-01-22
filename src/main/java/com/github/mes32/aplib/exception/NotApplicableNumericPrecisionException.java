package com.github.mes32.aplib.exception;

public class NotApplicableNumericPrecisionException extends Exception {
    public NotApplicableNumericPrecisionException() {
        super();
    }

    public NotApplicableNumericPrecisionException(String message) {
        super(message);
    }

    public NotApplicableNumericPrecisionException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotApplicableNumericPrecisionException(Throwable cause) {
        super(cause);
    }
}