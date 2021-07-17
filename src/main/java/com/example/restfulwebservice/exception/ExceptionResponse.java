package com.example.restfulwebservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data //getter setter
@AllArgsConstructor // 모든 매개변수를 가진 생성자
@NoArgsConstructor // 매개변수를 갖지 않는 생성자
public class ExceptionResponse {
    private Date timeStamp;
    private String message;
    private String details;

}
