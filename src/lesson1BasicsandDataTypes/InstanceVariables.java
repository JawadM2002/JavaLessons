package lesson1BasicsandDataTypes;

public class InstanceVariables {

	public String biscuit; 
	
	public InstanceVariables() {
		this.biscuit = "Custard Creams"; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVariables name = new InstanceVariables(); // className name = new className();
		
		System.out.println("My favourite biscuit is " + name.biscuit);

	}

}
