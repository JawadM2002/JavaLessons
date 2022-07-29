package lesson1BasicsandDataTypes;

public class DataTypes { // Data types - different sizes and values stored in variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Primitive data types - only single values that have no special capabilities
		boolean apple = false; // Boolean - will print if value is written as true or false
		boolean banana = true;
		
		if (banana == true) {
			System.out.println("I eat bananas");
		}
		
		if(apple == false) {
			System.out.println("I eat apples");
			
			byte a = 127;
			System.out.println(a);
			
			a++; // overflows as byte can hold values from -128 to 127
			System.out.println(a);
			
			a++;
			System.out.println(a); 
			
			/* short - 2 byte/16 bits two's complement integer, used to save memory in large arrays
			Values: -32, 768 to 32, 767 (inclusive)
			
			int - 32 bits/4 bytes 
			*/
			
			float value1 = 9.87f;
			System.out.println(value1);
			
			char a1 = 'D'; 
			int i = 25;
			byte b = 5;
			short s = 53;
			double d = 4.37;
			float f1 = 4.74f;
			long l1 = 12341234;
			
			System.out.println("char: " + a1);
			System.out.println("integer: " + i);
			System.out.println("byte: " + b);
			System.out.println("short: " + s);
			System.out.println("float: " + f1);
			System.out.println("double: " + d);
			System.out.println("long: " + l1);
			
		}
	}
}
