package spiritAI.test


import org.junit.Assert
import org.junit.Test

class TestFizzBuzzPinkFlamingoTests {

	@Test
	fun returnFizzOnNumbersMultiple3() {
		val actualResult = FizzBuzzPinkFlamingo().getSequence(9)
		Assert.assertTrue(actualResult[9].equals("Fizz"))
	}

	@Test
	fun returnBuzzOnNumbersMultiple5() {
		val actualResult = FizzBuzzPinkFlamingo().getSequence(10)
		Assert.assertTrue(actualResult[10].equals("Buzz"))
	}

	@Test
	fun returnFizzBuzzOnNumbersMultiple3and5() {
		val actualResult = FizzBuzzPinkFlamingo().getSequence(15)
		Assert.assertTrue(actualResult[15].equals("FizzBuzz"))
	}

	@Test
	fun returnFlamingoOnFibonacciNumbersAndMultiple3and5() {
		val actualResult = FizzBuzzPinkFlamingo().getSequence(15)
		Assert.assertTrue(actualResult[1].equals("Flamingo"))
		Assert.assertTrue(actualResult[2].equals("Flamingo"))
		Assert.assertTrue(actualResult[3].equals("Fizz Flamingo"))
		Assert.assertTrue(actualResult[5].equals("Buzz Flamingo"))
	}


}


