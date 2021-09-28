package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController/*Json을 반환하는 Controller*/
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
