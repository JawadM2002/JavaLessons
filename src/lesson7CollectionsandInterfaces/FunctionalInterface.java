package lesson7CollectionsandInterfaces;

public class FunctionalInterface {
// A functional interface is an interface that contains only one abstract method.
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				System.out.println("The thread has been created.");
			}
		}).start();

	}

}
