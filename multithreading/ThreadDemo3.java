package multithreading;

class MyThread1 implements Runnable{

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++)System.out.println("Child Thread");
	}
	
}
public class ThreadDemo3 {

	public static void main(String[] args) {
		
		MyThread1 m1 = new MyThread1();
		Thread t1    = new Thread(m1);
	
		t1.start();
		for(int i=1;i<=10;i++)System.out.println("Parent Thread");
	}

}
