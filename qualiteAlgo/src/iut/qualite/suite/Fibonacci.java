/**
 * Fibonacci									31/01/2024
 * IUT Rodez - pas de droits d'auteur, ni de copyright
 */
package iut.qualite.suite;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Algorithme concernant la suite de Fibonacci.
 */
public class Fibonacci {
	
	/**
	 * Valeur de la suite de Fibonacci. 
	 * Fibonacci(i) = suiteFibonacci.get(i)
	 */
	private static List<BigInteger> suiteFibonacci = new ArrayList<BigInteger>(List.of(BigInteger.ZERO, BigInteger.ONE));

	/**
	 * Suite rÃ©cursive de Fibonacci.
	 * @param pIndice Indice de la suite
	 * @return Terme de la suite d'indice indice
	 * @throws IllegalArgumentException L'indice ne peut pas être inférieur à 0
	 */
	public static BigInteger suiteRecursive(int pIndice) {
		
		if (pIndice < 0) {
			throw new IllegalArgumentException("Indice inférieur à 0");
		}
		
		if (pIndice < suiteFibonacci.size()) {
			return suiteFibonacci.get(pIndice);
		}
		suiteFibonacci.add(suiteRecursive(pIndice - 1).add(suiteRecursive(pIndice - 2)));
		return suiteFibonacci.get(pIndice);
	}
	
	/**
	 * Suite itérative de Fibonacci.
	 * @param pIncrement Incrément de la suite
	 * @return Valeur final par rapport à l'incrément
	 */
	public static BigInteger suiteIterative(int pIncrement) {
				
		BigInteger fn = BigInteger.ZERO; // F(n), au départ F(0)
		BigInteger fn1 = BigInteger.ONE; // F(n+1), au départ F(1)
		BigInteger tmp; // Variable tmp
		
		while (pIncrement >= 0) {
			tmp = fn;
			fn = fn.add(fn1);
			fn1 = tmp;
			pIncrement--;
		}
		
		return fn1;
	}
}
