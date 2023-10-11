package com.newPaxtu.newpaxtubackend.test.controller;

import com.newPaxtu.newpaxtubackend.test.bean.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {
    @GetMapping("/test")
    public Object testConnection() {
        return new Test("Conectado");
    }
}
