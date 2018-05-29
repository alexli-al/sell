package com.mtx.sell.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRestful {

    @RequestMapping("/home")
    public String test(){
        return "home";
    }
}
