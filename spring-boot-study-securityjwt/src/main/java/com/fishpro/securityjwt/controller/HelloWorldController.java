package com.fishpro.securityjwt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping({ "/hello" })
    public ResponseEntity<String> firstPage() {
        return new ResponseEntity<String>("{\"result\":\"success\"}", HttpStatus.OK);
    }

}