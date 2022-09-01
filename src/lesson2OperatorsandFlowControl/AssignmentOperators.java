package lesson2OperatorsandFlowControl;

public class AssignmentOperators {
	public static void main(String[] args) {
		int num;
		String name;
		
		num = 15;
		name = "J";
		
		System.out.println("num is assigned: " + num);
		System.out.println("name is assigned: " + name);
		
		/* += operator - operates by adding current value of variable on the left to the value on right and then assign result 
		 * to the operand on left
		 */
		int num1 = 20, num2 = 1; // the three lines here are necessary for declaring variables to use each operator
		System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        
        num1 += num2; // Adds and assigns values
        
        System.out.println("num1 = " + num1); // displays assigned values
        
        // -= operator subtracts variable's value on right from current value on the left and then assigns the result to operand on left
        
        num1 -= num2; 
        
        System.out.println("num1 = " + num1);
        
        // *= operator multiplies current variable value on the left to the value on the right, and assign result to the left operand
        
        num1 *= num2;
        
        System.out.println("num1 = " + num1);
		
        // /= operator divides current variable value on the left by the value on the right, then assigns quotient to left operand
        
        num1 *= num2;
        
        System.out.println("num1 = " + num1);
        
        // %= operator divides current variable value on the left by the value, then assigns remainder to the left operand
        
        num1 %= num2;
        
        System.out.println("num1 = " + num1);
        
	}

}
