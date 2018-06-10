package spiritAI.test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestApplication

fun main(args: Array<String>) {
    println(FizzBuzzPinkFlamingo().getSequence(100))
}
