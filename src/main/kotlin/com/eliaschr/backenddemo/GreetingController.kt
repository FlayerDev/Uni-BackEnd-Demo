package com.eliaschr.backenddemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

// @RestController: This tells Spring Boot that this class will handle HTTP requests.
@RestController
class GreetingController {

    // @GetMapping: This means this method will handle GET requests.
    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        // This method returns a simple greeting message.
        return "Hello, $name!"
    }

    @PostMapping("/greeting")
    fun createdGreeting(@RequestBody request: GreetingRequest): String {
        return "Hi ${request.name} you sent ${request.message}"
    }
}
