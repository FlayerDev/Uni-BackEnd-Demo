package com.eliaschr.backenddemo

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestBody
import java.time.LocalDateTime
import com.eliaschr.backenddemo.Message
import com.eliaschr.backenddemo.MessageRepository

@RestController
class MessageController (val messageRepo: MessageRepository) {
    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return "Hello, $name!"
    }
    @GetMapping("/messages")
    fun getMessageHistory(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        val mssgcnt: Long = messageRepo.count()
        var allmssgs: String = ""
        for (mes in messageRepo.findAll()){
            allmssgs += (/*mes.ID.toString() +*/ "  [" + mes.dateCreated.toString() + "]: " + mes.message + "\n")
        }
        return "$mssgcnt Messages \n$allmssgs"
    }

    @PostMapping("/send")
    fun createdGreeting(@RequestBody request: String): String {
        val mssg = Message(name = "name", message = request, dateCreated =  LocalDateTime.now() )
        messageRepo.save(mssg)
        return "Hi you sent $request"
    }
}