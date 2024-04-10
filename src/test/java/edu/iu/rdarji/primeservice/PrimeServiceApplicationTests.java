package edu.iu.rdarji.primeservice;

import edu.iu.rdarji.primeservice.service.PrimesService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PrimeServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	PrimesService primesService = new PrimesService();

	@Test
	void _45IsNotPrime() {
		int n = 45;
		boolean expected = false;
		boolean actual = primesService.isPrime(n);
		assertEquals(expected, actual);
	}

	@Test
	void _536225IsNotPrime() {
		long n = 536225;
		boolean expected = false;
		boolean actual = primesService.isPrime(n);
		assertEquals(expected, actual);
	}

	@Test
	void _285191IsPrime() {
		long n = 285191;
		boolean expected = true;
		boolean actual = primesService.isPrime(n);
		assertEquals(expected, actual);
	}

}
