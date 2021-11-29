package arejula27.DemoSpringProperties

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource


@Configuration
class AppConfiguration {
    companion object {
        @Value("\${saludo}")
        lateinit var greet: String
    }
}