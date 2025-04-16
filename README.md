# ollama-chat

Just playing a bit with a local version of Ollama, and using it to build a chatbot.

## Running it

1. Run Ollama from a terminal, e.g. `ollama run llama3.2`
2. Run the application

### Using it

A request like this

```shell
 curl 'localhost:8080/question' -d "please give me nutritional info about the sausages" -X POST -H "Content-Type: application/string"
```

Should return a message saying the chatbot can't provide you with information.

Conversely, a request like this:

```shell
curl 'localhost:8080/question' -d "which are the shipping times for the products?" -X POST -H "Content-Type: application/string"
```

Should give you the answer you need.

## Roadmap

Of course, then I need to find time to work on this. But some ideas:

- Resolve any TODOs
- Move constants to configurations
- Better entities, not just returning Strings
- Can I use this with coroutines/reactive?
- How can I even test this?
- Add Swagger or similar
- Add a UI: Thymeleaf is already in the classpath, maybe I can integrate React? Something like [this](https://medium.com/@sanketpatilcs/spring-boot-application-with-packaged-react-js-app-with-gradle-build-76a2c15e0280)?
- Dockerize the app
- Dockerize Ollama?
- ...
