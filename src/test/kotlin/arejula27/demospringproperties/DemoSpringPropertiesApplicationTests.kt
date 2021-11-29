package arejula27.demospringproperties

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoSpringPropertiesApplicationTests(
	@Autowired val restTemplate: TestRestTemplate
) {

	@Value("\${my.greet:Rana}")
	lateinit var greet: String

	@Test
	fun `Assert that greet contains locale data`(){
		assertThat(greet).isNotEqualTo("Rana")
	}

	@Test
	fun `Assert response uses locale data`() {
		val entity = restTemplate.getForEntity("/", String::class.java)
		assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
		assertThat(entity.body).contains("Spring dice $greet")
	}

}