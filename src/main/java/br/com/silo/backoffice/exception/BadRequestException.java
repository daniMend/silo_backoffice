package br.com.silo.backoffice.exception;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String exception) {
        super(exception);
    }
}
