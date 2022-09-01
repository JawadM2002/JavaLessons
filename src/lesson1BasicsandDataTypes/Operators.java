package lesson1BasicsandDataTypes;

public class Operators { // Assignment Operators

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 21, num2 = 420, sum = 0;
		
		sum = num1 + num2; // Adds the numbers together
		System.out.println("The added sum is " + sum);
		
		int num3 = 69, num4 = 36, sub = 0;
		
		sub = num3 - num4; // Subtracts numbers
		System.out.println("Subtraction value is: " + sub);
		
		int num5 = 15, num6 = 32, mult = 0;
		mult = num5 * num6; // multiplies numbers together
		System.out.println("Multiplication = " + mult);
		
		int num7 = 500, num8 = 2, divi = 0;
		divi = num7 / num8; // Divides numbers
		System.out.println("Division is: " + divi);
		
		int num9 = 7, num10 = 3, remain = 0;
		remain = num9 % num10; // Gives the remainder of the numbers
		System.out.println("Remainder is " + remain);

	}

}
