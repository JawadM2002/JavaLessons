package lesson7CollectionsandInterfaces;
// Nested Interface - an interface that is declared as a member of a class or another interface
class Int2 { // classname.interfacename
	interface Yes {
		void show();
	}
}

class Test implements Int2.Yes {
	public void show( ) {
		System.out.println("Method of interface");
	}
}

public class NestedInterface {

	public static void main(String[] args) {
		Int2.Yes obj;
		Test t = new Test();
		obj=t;
		obj.show();
		
	}

}
