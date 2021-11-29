package arejula27.DemoSpringProperties

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloController {


    @GetMapping("/")
    fun index(): String? {
        val greeter = GreetingsProviderImpl()
        return "Spring dice ${greeter.greet}"
    }
}