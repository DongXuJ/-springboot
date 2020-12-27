package com.example.demok8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TestCtl {


    @GetMapping("/")
    public Object init() {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("title", "this is a k8s demo");
        for (int i = 0; i < 10; i++) {
            map.put(i, System.nanoTime());
        }
        return map;
    }
}
