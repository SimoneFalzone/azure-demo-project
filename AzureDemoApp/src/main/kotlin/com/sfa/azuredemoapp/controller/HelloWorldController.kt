package com.sfa.azuredemoapp.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api")
class HelloWorldController {

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello from Azure!!! New Version 2.0!!!"
    }
}