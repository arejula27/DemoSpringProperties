package arejula27.DemoSpringProperties

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.PropertySource
import java.util.*

class GreetingsProvider {
    @Value("\${my.greet}")
    lateinit var  greet: String
}




