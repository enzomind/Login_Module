package com.gkms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerBase {

    @PostMapping("/test")
    public String test() {

        return "<h1>test 성공했따</h1>";
    }
}
