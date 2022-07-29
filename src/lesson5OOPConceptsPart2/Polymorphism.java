package lesson5OOPConceptsPart2;

class Parent {
	void Print() {
		System.out.println("This is the Parent Class.");
	}
}

class firstsubclass extends Parent {
	void Print() {
		System.out.println("The first subclass.");
	}
}

class secondsubclass extends Parent {
	void Print() {
		System.out.println("The second subclass.");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		
		Parent a;
		
		a = new firstsubclass();
		a.Print();
		
		a = new secondsubclass();
		a.Print();

	}

}
