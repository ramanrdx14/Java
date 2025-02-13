package multithreading;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		//String name = Thread.currentThread().getThreadGroup().getName();
		//System.out.println(name);
		
		ThreadGroup tg = new ThreadGroup("main-thread-group");
		Thread t1      = new Thread(tg, "mythread of main-thread-group");
		System.out.println(tg.getName());
		System.out.println(tg.getParent().getName());
	}

}
