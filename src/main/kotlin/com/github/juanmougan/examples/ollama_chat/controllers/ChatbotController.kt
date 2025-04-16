package com.github.juanmougan.examples.ollama_chat.controllers

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ChatbotController {

    @PostMapping("/question")
    suspend fun askQuestion(@RequestBody question: String): String {
        return "Not implemented!"
    }
}
