package multithreading;

class MyThread2 extends Thread{
	@Override
	public void run() {
		
	}
}
public class ThreadDemo4 {

	public static void main(String[] args) {
		MyThread2 mt2 = new MyThread2();
		mt2.start();
		mt2.start(); //we cannot start the thread 2 times

	}

}
