package com.eliaschr.backenddemo

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestBody
import java.time.LocalDateTime


@RestController
class MessageController {
    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return "Hello, $name!"
    }
    @GetMapping("/messages")
    fun getMessageHistory(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return "Awaiting DB integration"
    }

    @PostMapping("/send")
    fun createdGreeting(@RequestBody request: String): String {
        val mssg = Message("name",request, LocalDateTime.now() )
        return "Hi you sent $request"
    }
}