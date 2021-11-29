package arejula27.DemoSpringProperties

import org.springframework.beans.factory.annotation.Value
import java.util.*

interface GreetingsProvider {
    fun Greet(): String
}

class GreetingsProviderImpl :GreetingsProvider{

    lateinit var  greet: String


    override fun Greet(): String = AppConfiguration.greet
}