package iut.qualite.suite.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import iut.qualite.suite.Fibonacci;

class FibonacciTest {

	@Test
	void suiteRecursiveTest() {
		assertEquals(Fibonacci.suiteRecursive(0), BigInteger.ZERO);
		assertEquals(Fibonacci.suiteRecursive(1), BigInteger.ONE);
		
		assertEquals(Fibonacci.suiteRecursive(10), BigInteger.valueOf(55));
		assertEquals(Fibonacci.suiteRecursive(70), new BigInteger("190392490709135"));
		assertEquals(Fibonacci.suiteRecursive(106), new BigInteger("6356306993006846248183"));
	}
	
	@Test
	void suiteIterativeTest() {
		assertEquals(Fibonacci.suiteIterative(0), BigInteger.ZERO);
		assertEquals(Fibonacci.suiteIterative(1), BigInteger.ONE);
		
		assertEquals(Fibonacci.suiteIterative(10), BigInteger.valueOf(55));
		assertEquals(Fibonacci.suiteIterative(70), new BigInteger("190392490709135"));
		assertEquals(Fibonacci.suiteIterative(106), new BigInteger("6356306993006846248183"));
	}
}
