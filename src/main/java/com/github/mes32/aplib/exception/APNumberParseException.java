package com.github.mes32.aplib.exception;

public class APNumberParseException extends Exception {
    public APNumberParseException() {
        super();
    }

    public APNumberParseException(String message) {
        super(message);
    }

    public APNumberParseException(String message, Throwable cause) {
        super(message, cause);
    }

    public APNumberParseException(Throwable cause) {
        super(cause);
    }
}