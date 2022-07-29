package lesson3LoopsStringsandArrays;

public class DoWhileLoop {

	public static void main(String[] args) {
		// Do-while loop - checks for condition after executing the statements of loop body
		/* Syntax:
		 * do 
		 * {
		 * 		// Loop body 
		 * 		Update_expression
		 * }
		 * 
		 * Checks the condition
		 * while (test_expression);
		 */
		
		int i = 175;
		
		do {
			System.out.println("My dog stepped on a bee.");
			i++;
		}
		
		while (i < 180); // will print based on the difference

	}

}
