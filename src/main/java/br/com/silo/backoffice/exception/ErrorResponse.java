package br.com.silo.backoffice.exception;

import java.io.Serializable;

public class ErrorResponse implements Serializable {
    public String message;

    public ErrorResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
