package lesson5OOPConceptsPart2;

class one {
	public void print_this( ) {
		System.out.println("Multilevel ");
	}
}

class two extends one {
	public void print_that() {
		System.out.println("Inheritance ");
	}
}

class three extends two {
	public void print_this() {
		System.out.println("Multilevel Inheritance.");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		three s = new three();
		s.print_this();
	}

}
