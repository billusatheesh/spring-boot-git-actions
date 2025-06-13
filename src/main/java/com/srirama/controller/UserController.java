package com.srirama.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/greet")
    public ResponseEntity<String> greetUser(@RequestParam("userName")String userName) {
        return new ResponseEntity<>("Welcome to Git Actions Mr/Ms. "+userName, HttpStatus.OK);
    }
}
