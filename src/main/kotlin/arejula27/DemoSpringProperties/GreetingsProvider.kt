package arejula27.DemoSpringProperties

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.PropertySource
import java.util.*

interface GreetingsProvider {
    fun Greet(): String
}

@PropertySource
class GreetingsProviderImpl :GreetingsProvider{

    @Value("\${my.greet}")
    lateinit var  greet: String


    override fun Greet(): String = greet
}