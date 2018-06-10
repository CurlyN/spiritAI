package spiritAI.test

class FizzBuzzPinkFlamingo {
    fun getSequence(lengthOfSequence: Int): MutableList<String>{
        val result = mutableListOf<String>()

        for (i in 0..lengthOfSequence) {
            val printFromCheckOfMultiple = checkForMultipleToNumber(i)
            if (printFromCheckOfMultiple == "") result.add(i.toString())
            else result.add(printFromCheckOfMultiple)
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

}