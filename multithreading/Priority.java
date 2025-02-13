package multithreading;

class MyThread4 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread.currentThread().setPriority(5);
		System.out.println("hi" + Thread.currentThread().getName()+" --"+Thread.currentThread().getPriority());
	}
}
public class Priority {

	public static void main(String[] args) {
		MyThread4 my = new MyThread4();
		my.start();
		Thread.currentThread().setPriority(10);
		// we can use 
		my.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("hello" + Thread.currentThread().getName()+" --"+Thread.currentThread().getPriority());
		

	}

}
