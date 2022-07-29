package lesson3LoopsStringsandArrays;

public class Array {

	public static void main(String[] args) {
		// Array - group of like-typed variables referred to by a common name
		/* One-Dimensional Array:
		 * type var-name[]; 
		 * OR
		 * type[] var-name;
		 * The declaration has two components:
		 * type - it determines the data types of each element that comprises the array
		 * Declarations:
		 * int intArray[];
		 * byte byteArray[];
		 * short shortsArray[];
		 * boolean booleanArray[];
		 * long longArray[];
		 * float floatArray[];
		 * double doubleArray[];
		 * char charArray[];
		 * 
		 * MyClass myClassArray[];
		 * Object[] ar,
		 * Collection[] ca;
		 */
		
		int[] arr; // this will declare an array of integers
		
		arr = new int[10]; // allocates memory for 10 integers
		
		arr[0] = 2; // initialises the elements
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 21;
		arr[4] = 25;
		arr[5] = 29;
		arr[6] = 35;
		arr[7] = 47;
		arr[8] = 58;
		arr[9] = 69;
		
		for (int i = 0; i < arr.length; i++) // access the elements of the specified array
			System.out.println("Element at the index " + i + " : " + arr[i]); 

	}

}
