package spiritAI.test

class FizzBuzzPinkFlamingo {
    fun getSequence(lengthOfSequence: Int): MutableList<String>{
        val result = mutableListOf<String>()

        for (i in 0..lengthOfSequence) {
           if (isMultipleToNumber(i, 3)) result.add("Fizz")
            else if (isMultipleToNumber(i, 5)) result.add("Buzz")
             else result.add(i.toString())
        }
        return result
    }

    fun isMultipleToNumber(number: Int, devider: Int): Boolean{

        if (number!=0 && number % devider == 0) return true

        return false
    }

}