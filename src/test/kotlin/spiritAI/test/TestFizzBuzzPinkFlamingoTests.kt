package spiritAI.test


import org.junit.Assert
import org.junit.Test

class TestFizzBuzzPinkFlamingoTests {

	@Test
	fun returnFizzOnNumbersMultiple3() {
		val expectedResult = Array(5, { "0";"1"; "2";"Fizz";"4"})
		val actualResult = FizzBuzzPinkFlamingo().getSequence(5)
		Assert.assertTrue(expectedResult contentEquals actualResult)

	}

}


