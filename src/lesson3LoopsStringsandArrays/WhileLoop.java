package lesson3LoopsStringsandArrays;

public class WhileLoop {

	public static void main(String[] args) {
		/* Syntax
		 * while (test_expression) 
		 * {
		 *     // statements
		 *     
		 *     update_ expression;
		 * }
		 */
		int i = 1; // i initialised with value 1
		
		while (i < 6) { // Yields true as 1 is less than 6, will be true until value 6 is reached
			System.out.println("Hello everyone"); // will print 5 times as values 1 to 5 is less than 6
			
			i++;
		}

	}

}
