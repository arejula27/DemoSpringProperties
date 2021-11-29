package arejula27.demospringproperties

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component


@Component
class GreetingsProvider {
    @Value("\${my.greet:Sapo}")
    lateinit var greet: String

    fun greet() = greet
}




