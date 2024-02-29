package com.authorization.hw_spring_boot_rest.handlerException;

import com.authorization.hw_spring_boot_rest.exception.InvalidCredentials;
import com.authorization.hw_spring_boot_rest.exception.UnauthorizedUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerException {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> invalidCredentailsHandler(InvalidCredentials e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(UnauthorizedUser.class)
    public String unauthorizedUserHandler(UnauthorizedUser e){
        System.out.println(e.getMessage());
        return e.getMessage();
    }

}
