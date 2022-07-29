package lesson7CollectionsandInterfaces;

public class FunctionalInterfaceLambda {

	public static void main(String[] args) {

		new Thread(() -> {
			System.out.println("Lambda expression thread created");
		}).start();

	}

}