package spiritAI.test

class FizzBuzzPinkFlamingo {
    fun getSequence(lengthOfSequence: Int): MutableList<String>{
        val result = mutableListOf<String>()

        for (i in 0..lengthOfSequence) {
            //Perform checks of the number in the sequence
            val checkResultOfFibonacci = checkForFibonacciNumber(i)
            var checkResultOfMultiplication = checkForMultipleToNumber(i)

            //Add space after FizzBuzz if the number is not Fibonacci
            checkResultOfMultiplication = if (!checkResultOfFibonacci.equals("") && !checkResultOfMultiplication.equals(""))
                checkResultOfMultiplication.plus(" ") else checkResultOfMultiplication

            //Change FizzBuzzFlamingo into Pink Flamingo or return combined result
            if (checkResultOfMultiplication.equals("") && checkResultOfFibonacci.equals("")) result.add(i.toString())
            else if ((checkResultOfMultiplication + checkResultOfFibonacci)
                    .equals("FizzBuzzFlamingo")) result.add("Pink Flamingo")
            else result.add(checkResultOfMultiplication.plus(checkResultOfFibonacci))
        }

        return result
    }

    fun checkForMultipleToNumber(number: Int): String{
        if (isMultipleToNumber(number, 15)) return "FizzBuzz"
        else if (isMultipleToNumber(number, 3)) return "Fizz"
        else if (isMultipleToNumber(number, 5)) return "Buzz"
        return ""
    }

    fun isMultipleToNumber(number: Int, divider: Int): Boolean{
        return (number!=0 && number % divider == 0)
    }

    fun checkForFibonacciNumber(number: Int): String{
        if (isFibonacci(number)) return "Flamingo"
        return ""
    }
    fun isFibonacci(number: Int): Boolean{
        if (number  == 0) return false
        return isPerfectSquare(5*number*number + 4) ||
                isPerfectSquare(5*number*number - 4)
    }
    fun isPerfectSquare(number: Int): Boolean{
        val s = kotlin.math.sqrt(number.toDouble()).toInt()
        return (s*s == number)
    }


}