package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

 class Task2 implements Callable{
	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		return new ArrayList(List.of(10,20,30));
	}
}
public class ThreadCallable1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Task2  t2 = new Task2();
		ExecutorService es = Executors.newFixedThreadPool(5);
		Future f = es.submit(t2);
		System.out.println(f.get());
		
		es.shutdown();
	}
}
