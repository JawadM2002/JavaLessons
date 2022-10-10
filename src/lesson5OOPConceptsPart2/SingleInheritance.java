package lesson5OOPConceptsPart2;

class object{ // class A
	public void print_it() {
		System.out.println("This is ");
	}
}

class objects extends object { // class B
	public void print_that() {
		System.out.println("Single Inheritance.");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		objects g = new objects();  
		g.print_it();
		g.print_that();

	}

}
*/
