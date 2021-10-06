package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
/**
 * 1. @springBootApplication으로 인해 자동 설정, 스프링 Bean 읽기와 생성 모두 자동으로 설정 가능
 * 2.여기서부터 읽어가기 때문에 항상 파일의 최상단에 위치해 있어야 한다.
 * */
public class Application {
    public static void main(String[] args){
        /*앞으로 만들 클래스의 메인 클래스*/
        SpringApplication.run(Application.class, args);
    }
}
