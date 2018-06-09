package spiritAI.test

class FizzBuzzPinkFlamingo {
    fun getSequence(lengthOfSequence: Int): MutableList<String>{
        val result = mutableListOf<String>()

        for (i in 0..lengthOfSequence) {
           if (isMultiple3(i)) result.add("Fizz")
            else if (isMultiple5(i)) result.add("Buzz")
             else result.add(i.toString())
        }
        return result
    }

    fun isMultiple3(number: Int): Boolean{

        if (number!=0 && number % 3 == 0) return true

        return false
    }

    fun isMultiple5(number: Int): Boolean{

        if (number!=0 && number % 5 == 0) return true

        return false
    }
}