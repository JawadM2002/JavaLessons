package lesson4OOPConceptsPart1;

public class Encapsulation {
	/* we have declared private variables, which can only be accessed by the class's
	 * public methods
	 */
	private String name;
	private int size;
	private int age;
	
	// each private variable has a get method for the name	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name; 
	} 
	
	public int getSize() {
		return size;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setSize(int newSize) {
		size = newSize;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}

	public class TestEncapsulation {
	    public static void main(String[] args)
	    {
	        Encapsulation obj = new Encapsulation();
	        
	        // sets values of the variables
	        obj.setName("My name");
	        obj.setAge(19);
	        obj.setSize(5);
	        
	        // Displays variables values
	        System.out.println("Name: " + obj.getName());
	        System.out.println("Age: " + obj.getAge());
	        System.out.println("Size: " + obj.getSize());
	        
	    }
}
}