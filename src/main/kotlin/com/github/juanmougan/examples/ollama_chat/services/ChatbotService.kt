package com.github.juanmougan.examples.ollama_chat.services

import com.github.juanmougan.examples.ollama_chat.models.Prompt
import org.springframework.ai.ollama.OllamaChatModel
import org.springframework.stereotype.Service

@Service
class ChatbotService(private val chatModel: OllamaChatModel, private val configPrompt: Prompt) {

    fun answer(question: String): String {
        val prompt = "${configPrompt}. Here is the customer's question: $question"
        val response = chatModel.call(prompt)
        return response
    }
}
