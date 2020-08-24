package com.pratap.unittesting;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = {"classpath:test-configuration.properties"})
class MockitoTestingApplicationTests {

	@Test
	void contextLoads() {
	}

}
