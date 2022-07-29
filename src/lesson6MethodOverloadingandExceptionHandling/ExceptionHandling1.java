package lesson6MethodOverloadingandExceptionHandling;

// toString() - prints exception information in the format of the name of the exception
public class ExceptionHandling1 {
	public static void main(String[] args) {
		int a=5;
		int b=0;
		try {
			System.out.println(a/b);
		}
	catch(ArithmeticException e) {
		System.out.println(e.toString());
		}
	}
}

