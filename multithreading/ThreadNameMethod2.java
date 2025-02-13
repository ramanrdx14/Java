package multithreading;

public class ThreadNameMethod2 extends Thread{
	public void run() {
		System.out.println("hi");
		Thread.currentThread().setName("Child Thread");
	}
	public static void main(String[] args) {
		Thread.currentThread().setName("Raman");
		ThreadNameMethod2 tm2 = new ThreadNameMethod2();
		tm2.start();
		//System.out.println(10/0); // exception inthread raman
	}

}
