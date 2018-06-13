package spiritAI.test

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner
import com.fasterxml.jackson.databind.ObjectMapper


@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EndpointsTest {

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun testRunFizzBuzzController() {
        val result = testRestTemplate.getForEntity("/runFizzBuzz", String::class.java)
        //check if endpoints receives the data and return status 200. We checked result in unit test for the function
        assertEquals(HttpStatus.OK, result.statusCode)

    }

    @Test
    fun testRRomanCalculatorController() {
        //create json media type for post body
        val mapper = ObjectMapper()
        val actualObj = mapper.readTree("\"X-I\"")

        val result = testRestTemplate.postForEntity("/calculate", actualObj, String::class.java)
        assertEquals(HttpStatus.OK, result.statusCode)
        assertEquals("IX", result.body.toString())

    }
}