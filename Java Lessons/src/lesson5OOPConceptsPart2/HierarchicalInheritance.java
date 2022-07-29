package lesson5OOPConceptsPart2;

class A { // base class / superclass
	public void class_a() {
		System.out.println("First Class");
	}
}

class B extends A {
	public void class_b() {
		System.out.println("Second Class");
	}
}

class C extends A { 
	public void class_C() {
		System.out.println("Third Class");
	}
}

class D extends A {
	public void class_D() {
		System.out.println("Fourth Class");
	}
}

public class HierarchicalInheritance {
// one class serves as a superclass (base class) for more than one subclass
	
	public static void main(String[] args) {
		B obj_B = new B();
		obj_B.class_a();
		obj_B.class_b();
		
		C obj_C = new C();
		obj_C.class_a();
		obj_C.class_C();
		
		D obj_D = new D();
		obj_D.class_a();
		obj_D.class_D();

	}

}
