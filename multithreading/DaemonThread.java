package multithreading;

public class DaemonThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		
		DaemonThread dt = new DaemonThread();
		dt.setDaemon(true);
		dt.start();
		
		System.out.println(dt.isDaemon());
		
		//if the thread is already started we can't make it daemon
		//dt.setDaemon(true);
		
		System.out.println(dt.isDaemon());
	}

}
