package multithreading;

public class AnonymousThread {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				
				System.out.println("hello");
			}
		};
		
		t1.start();
		
	}

}
