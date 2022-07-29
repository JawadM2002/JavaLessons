package lesson7CollectionsandInterfaces;

// Interface - defined as an abstract type used to specify the behaviour of a class. Blueprint of class

interface Int1 {  // we use interface class, interface interfaceName {
	
	final int a = 15;
	
	void display();
}

public class Interface implements Int1 { // The public class will implement the interface class
	
	public void display() {
		System.out.println("Interface");
	}

	public static void main(String[] args) {
		Interface i = new Interface();
		i.display();
		System.out.println(a);
	}
}