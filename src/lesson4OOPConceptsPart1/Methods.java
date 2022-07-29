package lesson4OOPConceptsPart1;

import java.io.*;

public class Methods { 
	// Method in Java - A Collection of statements that performs specific task and return result to caller.
	/* Modifier - defines access type of the method, i.e. from where the method can be accessed in the application.
	 * public - accessible in all classes
	 * protected - accessible within the class in which it is defined 
	 * private - accessible only within the class in which it is defined.
	 * default - declared/defined without using any modifier.
	 */

		// Initially taking sum as 0
	    // as we have not started computation
	    int sum = 0;
	 
	    // Method to subtract two numbers
	    public int subTwoInt(int a, int b)
	    {
	 
	        // Add two integer value
	        sum = a - b;
	 
	        // Return sum of two values
	        return sum;
	    }
	}
	 
	// Helper class
	class Subtract {
	 
	    // Main driver method
	    public static void main(String[] args)
	    {
	 
	        // Creating object of class 1 inside main() method
	        Methods sub = new Methods(); // Methods class used for Subtraction
	 
	        // Calling method of above class
	        // to subtract the two integers
	        // using instance created
	        int s = sub.subTwoInt(55, 21);
	 
	        // Printing the sum of two numbers
	        System.out.println("Total of two integer values :"
	                           + s);
	    }
	}

// Output: Total of two integer values: 34