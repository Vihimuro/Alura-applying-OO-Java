package br.com.himuro.screenmatch.exceptions;

public class YearConversionException extends RuntimeException{
    private final String message;

    public YearConversionException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
