package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	
}
public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(10);
		Task t = new Task();
		
		for(int i=1;i<=5;i++) {
			es.execute(t); //bar bar alag alag thread ko uthaye ga thread pool se
		}
		es.shutdownNow();
	}

}
