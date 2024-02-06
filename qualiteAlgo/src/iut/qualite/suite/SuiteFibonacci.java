/**
 * SuiteFibonacci									31/01/2024
 * IUT Rodez - pas de droits d'auteur, ni de copyright
 */
package iut.qualite.suite;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Algorithme concernant la suite de SuiteFibonacci.
 */
public class SuiteFibonacci {
	
	/**
	 * Valeur de la suite de SuiteFibonacci. 
	 * SuiteFibonacci(i) = suiteFibonacci.get(i)
	 */
	private static List<BigInteger> suiteFibonacci = new ArrayList<BigInteger>(List.of(BigInteger.ZERO, BigInteger.ONE));

	/**
	 * Suite récursive de SuiteFibonacci.
	 * @param pIndice Indice de la suite
	 * @return Terme de la suite d'indice indice
	 * @throws IllegalArgumentException L'indice ne peut pas être inférieur à 0
	 */
	public static BigInteger suiteRecursive(int pIndice) {
		
		if (pIndice < 0) {
			throw new IndexOutOfBoundsException("Indice inférieur à 0");
		}
		
		if (pIndice < suiteFibonacci.size()) {
			return suiteFibonacci.get(pIndice);
		}
		suiteFibonacci.add(suiteRecursive(pIndice - 1).add(suiteRecursive(pIndice - 2)));
		return suiteFibonacci.get(pIndice);
	}
	
	/**
	 * Suite itérative de SuiteFibonacci.
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
