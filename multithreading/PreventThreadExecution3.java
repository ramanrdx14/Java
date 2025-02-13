package multithreading;
class MyThread7 extends Thread{
	Thread main_thread_ref;
	public  MyThread7(Thread t){
		this.main_thread_ref = t;
	}
	public void run() {
		
		
		try {
			main_thread_ref.join();  // this allow the child thread to stop and execute the main thread first
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
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
public class PreventThreadExecution3 {

	public static void main(String[] args) throws InterruptedException {
		MyThread7 mt7 = new MyThread7(Thread.currentThread());
		mt7.start();
		
		//mt7.join(); //this allow main thread to stop and execute the child thread
		
		System.out.println(Thread.currentThread().getName() +" hi");
		System.out.println(Thread.currentThread().getName() +"Sleeping...");
		for(int i=1;i<=5;i++) {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println(Thread.currentThread().getName() +"Wakeup");
	}

}
