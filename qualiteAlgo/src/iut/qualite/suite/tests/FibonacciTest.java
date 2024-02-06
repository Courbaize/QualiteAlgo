package iut.qualite.suite.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import iut.qualite.suite.SuiteFibonacci;

class FibonacciTest {

	@Test
	void suiteRecursiveTest() {
		assertThrows(IndexOutOfBoundsException.class, () -> SuiteFibonacci.suiteRecursive(-1));
		assertEquals(SuiteFibonacci.suiteRecursive(0), BigInteger.ZERO);
		assertEquals(SuiteFibonacci.suiteRecursive(1), BigInteger.ONE);
		
		assertEquals(SuiteFibonacci.suiteRecursive(10), BigInteger.valueOf(55));
		assertEquals(SuiteFibonacci.suiteRecursive(70), new BigInteger("190392490709135"));
		assertEquals(SuiteFibonacci.suiteRecursive(106), new BigInteger("6356306993006846248183"));
	}
	
	@Test
	void suiteIterativeTest() {
		assertEquals(SuiteFibonacci.suiteIterative(0), BigInteger.ZERO);
		assertEquals(SuiteFibonacci.suiteIterative(1), BigInteger.ONE);
		
		assertEquals(SuiteFibonacci.suiteIterative(10), BigInteger.valueOf(55));
		assertEquals(SuiteFibonacci.suiteIterative(70), new BigInteger("190392490709135"));
		assertEquals(SuiteFibonacci.suiteIterative(106), new BigInteger("6356306993006846248183"));
	}
}
