package com.github.juanmougan.examples.ollama_chat.controllers

import com.github.juanmougan.examples.ollama_chat.services.ChatbotService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ChatbotController(private val chatbotService: ChatbotService) {

    @PostMapping("/question")
    fun askQuestion(@RequestBody question: String): String = chatbotService.answer(question)

}
