package com.projetojavafx.javafxjdbcworkshop.model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException {
    private Map<String, String> errors = new HashMap<>();

    public ValidationException(String msg) {
        super(msg);
    }

    public Map<String, String> getErros(){
        return errors;
    }
    public void addError(String fieldName, String errorMessage){
        errors.put(fieldName, errorMessage);
    }
}