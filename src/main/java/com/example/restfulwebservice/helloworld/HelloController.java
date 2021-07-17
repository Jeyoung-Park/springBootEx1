package com.example.restfulwebservice.helloworld;

//import com.example.restfulwebservice.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//import sun.jvm.hotspot.HelloWorld;

@RestController
public class HelloController {
    //GET
    // /hello-worl (endpoint)
    // @RequestMapping(method=RequestMethod.GET, path="/hello-world") 예전 방식
    @GetMapping("/hello-world") //@GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World!";
    }

    //자바 빈 형대토 데이터 반환: json 형태로 반환
    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path="/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
