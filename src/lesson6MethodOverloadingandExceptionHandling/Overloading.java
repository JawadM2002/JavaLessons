package lesson6MethodOverloadingandExceptionHandling;

public class Overloading {
/*Overloading -  different methods to have the same name, but different signatures where the signature
 *  can differ by the number of input parameters or type of input parameters or both
*/
	public int sum(int x, int y) {
		return (x + y);
	}
	
	public int sum (int x, int y, int z) {
		return (x + y + z);
	}
	
	public double sum(double x, double y) {
		return (x+y);
	}
	
	
	public static void main(String[] args) {
		Overloading a = new Overloading();
		System.out.println(a.sum(15, 25));
		System.out.println(a.sum(12, 24, 36));
		System.out.println(a.sum(15.5, 20.5));

	}

}
