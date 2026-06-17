package com.example.Starter.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMsg {
    @GetMapping("/HelloMsg")
    public String Hello(){
        return "Hello SpringBoot";
    }
}
