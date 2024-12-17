package com.pllis.mylog.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;


@Tag(name = "Book API", description = "Swagger Book 테스트용 API")
@RestController
@RequestMapping("/api")
public class BookController {

    @Operation(summary = "리스트", description = "리스트 API 입니다.")
    @Parameter(name = "str", description = "2번 반복할 문자열")
    @GetMapping("/book")
    @ResponseBody
    public ResponseEntity<String> getBookList() {
        ResponseEntity<String> entity = null;
        try {
            // throw로 예외를 발생시킬 수 있습니다.
            // throw new Exception("예외를 강제로 발생시켰습니다.");
            entity = new ResponseEntity<String> ("SUCCESS연결성공 입니다!", HttpStatus.OK);
        } catch (Exception e)    {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
            entity = new ResponseEntity<> (e.getMessage(),HttpStatus.BAD_REQUEST);
        }
        return entity;
    }

}
