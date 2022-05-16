package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CommonController {

    @GetMapping("/")
    fun hello(): String {
        return "hello"
    }
}