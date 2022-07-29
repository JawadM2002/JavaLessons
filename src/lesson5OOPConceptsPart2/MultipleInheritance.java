package lesson5OOPConceptsPart2;

interface level1 {
	public void print_this();
}

interface level2 {
	public void print_that();
}

interface level3 extends level1, level2 {
	public void print_that2();
}

class child implements level3 {
	public void print_that2() {
		System.out.println("Multiple ");
	}
	public void print_that() {
		System.out.println("Inheritance");
	}
	public void print_this() {
		System.out.println("This is ");
	}
}

public class MultipleInheritance {
	
	/* one class can have more than one superclass and inherit features from all 
	 * inherit features from all parent class. 
	 * Java does NOT support multiple inheritance with classes, it can be 
	 * achievable only through interfaces
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child a = new child();
		a.print_this();
		a.print_that2();
		a.print_that();

	}

}
