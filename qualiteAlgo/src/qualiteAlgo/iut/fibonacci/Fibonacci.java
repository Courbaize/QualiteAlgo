/**
 * Fibonacci									31/01/2024
 * IUT Rodez - pas de droits d'auteur, ni de copyright
 */
package qualiteAlgo.iut.fibonacci;

import java.math.BigInteger;

/**
 * Algorithme concernant la suite de Fibonacci.
 */
public class Fibonacci {

	/**
	 * Suite récursive de Fibonacci.
	 * @param pIncrement Incrément de la suite
	 * @return Valeur final par rapport à l'incrément
	 */
	public static BigInteger suiteRecursive(int pIncrement) {
		
		if (pIncrement == 0) {
			return BigInteger.ZERO;
		}
		if (pIncrement == 1) {
			return BigInteger.ONE;
		}
		return suiteRecursive(pIncrement - 1).add(suiteRecursive(pIncrement - 2));
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
