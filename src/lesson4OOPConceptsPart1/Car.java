package lesson4OOPConceptsPart1;

public class Car { // Classes and Objects
	// Variables must be declared for OOP
	String name;
	String model;
	int age;
	String color;
	
	public Car(String name, String model, int age, String color) { // public className(Variables)
		this.name = name;
		this.model = model;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return name;
	}
	public String getModel() {
		return model;
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return color;
	}

	public String toString() {
		return("My car is "+this.getName()+
			".\nMy current model is " +
			this.getModel() + ", " + this.getAge()+
			", "+ this.getColor());
}
	
	public static void main(String[] args) {
		Car mclaren = new Car("McLaren", "720S", 3, "Black");
		System.out.println(mclaren.toString());

	}
}