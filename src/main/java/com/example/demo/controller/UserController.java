package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/api/getUser")
    public ResponseEntity getUser() {
        List< User > result = userService.getAllUser();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/api/getFourUser")
    public ResponseEntity getFourUser() {
        List< User > results = userService.getFourUser();
        return ResponseEntity.ok(results);
    }
}

