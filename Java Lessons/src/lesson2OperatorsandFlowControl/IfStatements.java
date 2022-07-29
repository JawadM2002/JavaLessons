package lesson2OperatorsandFlowControl;

public class IfStatements { 
/* if statement is used to decide whether a certain statement/block
of statements will be executed or not*/

	public static void main(String[] args) {
		int i = 20;
		
		if (i > 15) // condition - if i is greater than 15
			System.out.println("20 is greater than 15"); //Statement 1 - True
		else if (i == 15){
			System.out.println("This number is 15"); // else if can allow the user to choose multiple options
		} // The final else statement will be executed if no condition returns true
		else { // tell us that if a statement is true, it will execute the block of statements, but if false, it will not 
			System.out.println("20 is less than 15"); // it will move to next statement if it is false

			/* three jump statements: break, which is used to terminate the sequence in a switch statement and it can used to exit a loop.
	continue - useful for early iteration of a loop. 
	return - causes the program control to transfer back to the caller of a method
	*/
	}

}

}