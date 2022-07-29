package lesson2OperatorsandFlowControl;

public class UnaryOperators {

	public static void main(String[] args) {
		
		// Unary minus = converts a positive value into negative value
		int n1 = 20; // Declared a custom variable
		
		System.out.println("Number = " + n1);
		
		n1 = -n1; // Performing unary operation 
		
		System.out.println("Result = " + n1); // After unary
		
		// Not Operator(!) = Convert true to false or vice versa.
		// cond = !true; = False
		
		boolean cond = true; 
		int a = 10, b = 1;
		
		System.out.println("Cond is: " + cond);
		System.out.println("Variable 1: " + a);
		System.out.println("Variable 2: " + b);
		
		// After applying Unary not (!) operator
		System.out.println("Cond is: " + !cond);
		System.out.println("!(a < b): " + !(a < b)); // A is not greater than B because 10 is not greater than 1
		System.out.println("!(a > b): " + !(a > b)); 
		
		// Increment (++) - it increments the value of the integers, e.g
		/*num = 5;
		num++ = 6; */ // Post-increment operator = value is incremented but previous value is retained temporarily until it is executed
		// Pre increment = operand's value is incremented instantly when it is placed before variable name, ++num

		//Bitwise complement(~) - returns one's complement representation of the input value or operand, e.g. 0 to 1 and 1 to 0
	// a = 7 [0111 in Binary], and it will result to ~5 
		
		int n3 = 10, n4 = -5;
		
		//Before bitwise complement
		System.out.println("Number 1 = " + n3);
		System.out.println("Number 2 = " + n4);
		
		// After bitwise complement
		System.out.println(n3 + "'s bitwise complement = " + ~n3);
		System.out.println(n4 + "'s bitwise complement = " + ~n4);
	
	}

}
