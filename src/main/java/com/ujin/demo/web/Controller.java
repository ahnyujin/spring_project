package com.ujin.demo.web;

import com.ujin.demo.web.dto.ResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public ResponseDto helloDTO(@RequestParam("name") String name,
                                @RequestParam("amount") int amount) {
        return new ResponseDto(name, amount);
    }
}
