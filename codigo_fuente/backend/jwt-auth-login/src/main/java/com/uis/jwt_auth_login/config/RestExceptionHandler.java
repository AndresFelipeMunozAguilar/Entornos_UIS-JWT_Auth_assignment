package com.uis.jwt_auth_login.config;


import com.uis.jwt_auth_login.dto.ErrorDto;
import com.uis.jwt_auth_login.exceptions.AppException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(value = {AppException.class})
    @ResponseBody
    public ResponseEntity<ErrorDto> handleAppException(AppException ex) {
        return ResponseEntity.status(ex.getCode())
                .body(ErrorDto.builder().message(ex.getMessage()).build());

    }

}
