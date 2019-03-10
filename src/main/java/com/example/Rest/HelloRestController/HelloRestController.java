package com.example.Rest.HelloRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @RequestMapping("/hi")
    public String sayHi()
    {
        return "Hi!";
    }



}
