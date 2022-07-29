package lesson6MethodOverloadingandExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		//printStackTrack() - prints exception information on format of exception name
		int a =6;
		int b =3;
		try {
			System.out.println(a/b);
		}
	catch(ArithmeticException e){
		e.printStackTrace();
	}
		// .getMessage() - prints exception description
		

	}

}
