package br.com.weltonramos.ifood.anotaai.exceptions;

public class CategoryNotFoundException extends RuntimeException {

    private String message;

    public CategoryNotFoundException() {
    }

    public CategoryNotFoundException(String message) {
        super(message);
    }
}
