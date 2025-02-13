package multithreading;

public class ThreadMethod1 extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println("hi");
	}
	public static void main(String[] args) {
		ThreadMethod1 tm = new ThreadMethod1();
		tm.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println(tm.isAlive());
		
	}

}
