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
	fun returnBuzzOnNumbersMultiple5() {
		val expectedResult: MutableList<String> = mutableListOf("0", "1", "2", "Fizz", "4", "Buzz")
		val actualResult = FizzBuzzPinkFlamingo().getSequence(5)
		Assert.assertTrue(expectedResult.equals(actualResult))
	}

	@Test
	fun returnFizzBuzzOnNumbersMultiple3and5() {
		val actualResult = FizzBuzzPinkFlamingo().getSequence(15)
		Assert.assertTrue(actualResult[3].equals("Fizz"))
		Assert.assertTrue(actualResult[5].equals("Buzz"))
		Assert.assertTrue(actualResult[6].equals("Fizz"))
		Assert.assertTrue(actualResult[9].equals("Fizz"))
		Assert.assertTrue(actualResult[10].equals("Buzz"))
		Assert.assertTrue(actualResult[12].equals("Fizz"))
		Assert.assertTrue(actualResult[15].equals("FizzBuzz"))
	}


}


