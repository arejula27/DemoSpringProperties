package arejula27.demospringproperties

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloController(
    val greetingsProvider: GreetingsProvider
) {
    @GetMapping("/")
    fun index() = "Spring dice ${greetingsProvider.greet()}"
}