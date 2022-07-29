package lesson6MethodOverloadingandExceptionHandling;

public class ExceptionHandling2 {
	// .getMessage() - prints exception description
	public static void main(String[] args) {
		int a=5;
		int b=0;
		try{
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			}
		}
	}
