package multithreading;

class MyThread extends Thread{
	@Override
	public void run() {
		//thread task
		for(int i=0;i<10;i++) {
			System.out.println(i+"child thread");
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		for(int i=0;i<10;i++) {
			System.out.println(i+"main thread");
		}
	}
}
