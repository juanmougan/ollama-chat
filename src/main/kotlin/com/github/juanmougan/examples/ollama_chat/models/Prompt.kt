package com.github.juanmougan.examples.ollama_chat.models

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

/**
 * Models a prompt to the LLM, this can be configured via properties.
 */
@Component
class Prompt(
    @Value("\${company.name}") val companyName: String,
    @Value("\${company.description}") val companyDescription: String,
    @Value("\${chatbot.role}") val chatbotRole: String,
    @Value("\${chatbot.rules.blacklist}") val blacklist: List<String>,
    @Value("\${chatbot.rules.whitelist}") val whitelist: List<String>
) {
    override fun toString(): String {
        return """$chatbotRole ${companyName}, ${companyDescription}. 
            Here are some rules you must follow: 
                $blacklist
                $whitelist
        """.trimIndent()
    }
}
