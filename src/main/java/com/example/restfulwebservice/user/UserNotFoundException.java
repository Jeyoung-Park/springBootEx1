package com.example.restfulwebservice.user;

// HTTP Status Code
// 2XX -> ok
// 4XX -> Client
// 5XX -> Server

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message); //생성자, 부모 클래스에서 전달받은 message 사용
    }
}
