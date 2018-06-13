package spiritAI.test

class FizzBuzzPinkFlamingo {
    fun getSequence(lengthOfSequence: Int): MutableList<String>{
        val result = mutableListOf<String>()

        for (i in 0..lengthOfSequence) {
            //Perform checks of the number in the sequence, add space after FizzBuzz if the number is not Fibonacci
            val printFromCheckOfFibonacci = checkForFibonacciNumber(i)
            var printFromCheckOfMultiple = checkForMultipleToNumber(i)
            printFromCheckOfMultiple = if (!printFromCheckOfFibonacci.equals("") && !printFromCheckOfMultiple.equals(""))
                printFromCheckOfMultiple.plus(" ") else printFromCheckOfMultiple

            //Change FizzBuzzFlamingo into Pink Flamingo or return combined result
            if (printFromCheckOfMultiple.equals("") && printFromCheckOfFibonacci.equals("")) result.add(i.toString())
            else if ((printFromCheckOfMultiple + printFromCheckOfFibonacci).equals("FizzBuzzFlamingo")) result.add("Pink Flamingo")
            else result.add(printFromCheckOfMultiple.plus(printFromCheckOfFibonacci))
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
        if (number!=0 && number % divider == 0) return true

        return false
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