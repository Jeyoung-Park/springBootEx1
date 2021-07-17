package com.example.restfulwebservice.helloworld;

//lombok: 빈 클래스를 만들 떄 getter, setter, constructor 등을 자동 생성해줌
//@Data를 추가해주면 됨

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor //디폴트 생성자를 같이 만드는 경우
public class HelloWorldBean {

    private String message;

    //lombok을 사용하면 gettersetter 필요 x
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }

    //@AllArgsConstructor를 사용하므로 constructor 사용 x
//    public HelloWorldBean(String message) {
//        this.message=message;
//    }
}
