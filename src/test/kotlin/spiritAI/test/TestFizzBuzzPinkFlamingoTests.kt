package spiritAI.test


import org.junit.Assert
import org.junit.Test

class TestFizzBuzzPinkFlamingoTests {
    @Test
    fun return0ForFirstChar(){
        val actualResult = FizzBuzzPinkFlamingo().getSequence(5)
        Assert.assertTrue(actualResult[0] == "0")
    }

	@Test
	fun returnFizzOnNumbersMultiple3() {
		val actualResult = FizzBuzzPinkFlamingo().getSequence(9)
		Assert.assertTrue(actualResult[9] == "Fizz")
	}

	@Test
	fun returnBuzzOnNumbersMultiple5() {
		val actualResult = FizzBuzzPinkFlamingo().getSequence(10)
		Assert.assertTrue(actualResult[10] == "Buzz")
	}

	@Test
	fun returnFizzBuzzOnNumbersMultiple3and5() {
		val actualResult = FizzBuzzPinkFlamingo().getSequence(15)
		Assert.assertTrue(actualResult[15] == "FizzBuzz")
	}

	@Test
	fun returnFlamingoOnFibonacciNumbersAndMultiple3and5() {
		val actualResult = FizzBuzzPinkFlamingo().getSequence(15)
		Assert.assertTrue(actualResult[1] == "Flamingo")
		Assert.assertTrue(actualResult[2] == "Flamingo")
		Assert.assertTrue(actualResult[3] == "Fizz Flamingo")
		Assert.assertTrue(actualResult[5] == "Buzz Flamingo")
	}


}


