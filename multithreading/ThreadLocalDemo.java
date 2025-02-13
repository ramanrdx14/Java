package multithreading;


class Task3 extends Thread{
	ThreadLocal<Integer> t = new ThreadLocal<>();
	@Override
	public void run() {
		t.set(10);
		
		System.out.println(t.get()+" "+Thread.currentThread().getName());
	}
}

public class ThreadLocalDemo {

	public static void main(String[] args) {
		Task3 t = new Task3();
		t.start();

	}

}
