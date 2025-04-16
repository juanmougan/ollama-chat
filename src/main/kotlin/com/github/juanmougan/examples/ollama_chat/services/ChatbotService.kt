package com.github.juanmougan.examples.ollama_chat.services

import org.springframework.ai.ollama.OllamaChatModel
import org.springframework.stereotype.Service


// TODO move to some configuration
const val COMPANY_NAME = "Salchichetas Entreprise Corporation"
const val COMPANY_DESCRIPTION = "a company that manufactures sausages"
const val CHATBOT_DESCRIPTION = "You are a helpful chatbot working for $COMPANY_NAME, $COMPANY_DESCRIPTION"

const val RAG_DATA = """
    If a customer asks about nutritional facts, reply that you can't answer that. If they ask about shipping times, reply it's 24 hours.
    """

@Service
class ChatbotService(private val chatModel: OllamaChatModel) {

    fun answer(question: String): String {
        // maybe not the template
        val prompt = """
            $CHATBOT_DESCRIPTION. $RAG_DATA. Here is the customer's question: $question
        """.trimIndent()

        val response = chatModel.call(prompt)
        return response
    }
}
