package multithreading;

public class ThreadGroupDemo2 {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("main - ");
		Thread t1      = new Thread(tg,"1");
		Thread t2      = new Thread(tg,"2");
		
		t1.start();
		t2.start();
		tg.list();
		System.out.println(tg.getParent().activeCount());

	}

}
