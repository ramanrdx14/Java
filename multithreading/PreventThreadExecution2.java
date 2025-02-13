package multithreading;

class MyThread6 extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +" hi");
		System.out.println(Thread.currentThread().getName() +"Sleeping...");
		try {
			for(int i=1;i<=5;i++) {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() +"Wakeup");
	}
}
public class PreventThreadExecution2 {

	public static void main(String[] args) throws InterruptedException {
		MyThread6 mt5 = new MyThread6();
		mt5.start();
		Thread.yield();
		System.out.println(Thread.currentThread().getName() +" hi");
		System.out.println(Thread.currentThread().getName() +"Sleeping...");
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println(Thread.currentThread().getName() +"Wakeup");
	}

}
