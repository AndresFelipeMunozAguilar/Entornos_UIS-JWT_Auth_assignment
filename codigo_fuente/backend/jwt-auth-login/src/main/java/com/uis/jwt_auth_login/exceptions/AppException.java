package com.uis.jwt_auth_login.exceptions;

import org.springframework.http.HttpStatus;

public class AppException extends RuntimeException {

    private final HttpStatus code;

    public AppException(String messege, HttpStatus code) {
        super(messege);
        this.code = code;
    }

    public HttpStatus getCode() {
        return code;
    }
}
