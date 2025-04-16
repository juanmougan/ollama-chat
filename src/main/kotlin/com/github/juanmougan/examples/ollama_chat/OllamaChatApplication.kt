package com.github.juanmougan.examples.ollama_chat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OllamaChatApplication

fun main(args: Array<String>) {
	runApplication<OllamaChatApplication>(*args)
}
