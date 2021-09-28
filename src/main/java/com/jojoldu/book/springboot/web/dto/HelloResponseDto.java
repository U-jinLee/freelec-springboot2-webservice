package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter/*선언된 모든 필드의 getter 생성*/
@RequiredArgsConstructor /*선언된 모든 final(중요) 필드가 생성자를 생성*/
public class HelloResponseDto {
    private final String name;
    private final int amount;
}