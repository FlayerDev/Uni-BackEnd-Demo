package com.eliaschr.backenddemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import kotlin.collections.*
import kotlin.*

@RestController
class GreetingController {

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return "Hello, $name!"
    }

    @PostMapping("/greeting")
    fun createdGreeting(@RequestBody request: String): String {
        return "Hi you sent $request"
    }
}
