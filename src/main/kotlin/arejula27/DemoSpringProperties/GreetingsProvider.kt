package arejula27.DemoSpringProperties

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.PropertySource
import java.util.*



@PropertySource
class GreetingsProvider {
    @Value("\${my.greet}")
    lateinit var  greet: String

    fun Greet():String{
        return "Sapo"
    }
}




