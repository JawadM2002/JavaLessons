package lesson7CollectionsandInterfaces;
import java.lang.Cloneable;
// Clonable Interface
class A implements Cloneable {
	int i;
	String s;
	
	public A(int i, String s) {
		this.i = i;
		this.s = s;
		
	}
	protected Object clone()
	throws CloneNotSupportedException {
		return super.clone();
	}
}

public class MarkerInterface {

	public static void main(String[] args) 
		throws CloneNotSupportedException
	{
		A a = new A(5, "My dog stepped on a bee");
		
		A b = (A)a.clone();
		
		System.out.println(b.i);
		System.out.println(b.s);

	}

}
