package spiritAI.test

class FizzBuzzPinkFlamingo {
    fun getSequence(lengthOfSequence: Int): MutableList<String> {
        // first number is 0 which we do not need to check
        val result = mutableListOf("0")

        for (i in 1..lengthOfSequence) {
            // Perform checks of the number in the sequence
            val checkResultOfFibonacci = checkForFibonacciNumber(i)
            val checkResultOfMultiplication = checkForMultipleToNumber(i)

            // Add space after FizzBuzz if the number is Fibonacci or return as a digit.
            val resultPhrase =
                if (!checkResultOfMultiplication.isNullOrBlank() && !checkResultOfFibonacci.isNullOrBlank()) {
                    checkResultOfMultiplication.plus(" $checkResultOfFibonacci")
                } else if (!checkResultOfMultiplication.isNullOrBlank() || !checkResultOfFibonacci.isNullOrBlank()) {
                    checkResultOfMultiplication ?: checkResultOfFibonacci!!
                } else {
                    i.toString()
                }

            // Change FizzBuzzFlamingo into Pink Flamingo or return combined result
            // in the sequence 0..100 there are no numbers both fibonacci and multiple 15,
            // however if the sequence is higher then we still check
            if (resultPhrase == "FizzBuzz Flamingo") result.add("Pink Flamingo")
            else result.add(resultPhrase)
        }

        return result
    }

    fun checkForMultipleToNumber(number: Int): String? {
        if (isMultipleToNumber(number, 15)) return "FizzBuzz"
        else if (isMultipleToNumber(number, 3)) return "Fizz"
        else if (isMultipleToNumber(number, 5)) return "Buzz"
        return null
    }

    fun isMultipleToNumber(number: Int, divider: Int) =
        number % divider == 0

    fun checkForFibonacciNumber(number: Int): String? {
        if (isFibonacci(number)) return "Flamingo"
        return null
    }

    fun isFibonacci(number: Int) =
        isPerfectSquare(5 * number * number + 4) ||
            isPerfectSquare(5 * number * number - 4)

    fun isPerfectSquare(number: Int) =
        number.let(Int::toDouble)
            .let { kotlin.math.sqrt(it) }
            .let(Double::toInt)
            .let { it * it == number }
}