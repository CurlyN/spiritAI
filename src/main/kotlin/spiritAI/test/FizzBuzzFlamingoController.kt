package spiritAI.test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FizzBuzzFlamingoController {


    @GetMapping("/runFizzBuzz")
    fun run() =
            FizzBuzzPinkFlamingo().getSequence(100)
}
