package spiritAI.test


import org.junit.Assert
import org.junit.Test

class TestFizzBuzzPinkFlamingoTests {

	@Test
	fun returnFizzOnNumbersMultiple3() {
		val expectedResult: MutableList<String> = mutableListOf("0", "1", "2","Fizz","4")
		val actualResult = FizzBuzzPinkFlamingo().getSequence(4)
		Assert.assertTrue(expectedResult.equals(actualResult))
	}

	@Test
	fun returnFizzOnNumbersMultiple5() {
		val expectedResult: MutableList<String> = mutableListOf("0", "1", "2", "Fizz", "4", "Buzz")
		val actualResult = FizzBuzzPinkFlamingo().getSequence(5)
		println(expectedResult)
		println(actualResult)
		Assert.assertTrue(expectedResult.equals(actualResult))
	}


}


