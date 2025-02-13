package multithreading;


class Resource{
	
}
class ThreadOne extends Thread{
	Resource r1;
	Resource r2;
	public ThreadOne(Resource r1,Resource r2) {
		this.r1 = r1;
		this.r2 = r2;
	}
	@Override
	public void run() {
		
		synchronized (r1) {
			System.out.println("Thread one acquired resouce 1 Lock");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (r2) {
				System.out.println("Thread one acquired resouce 2 Lock");
			}
		}
	}
}
class ThreadTwo extends Thread{
	Resource r1;
	Resource r2;
	public ThreadTwo(Resource r1,Resource r2) {
		this.r1 = r1;
		this.r2 = r2;
	}
	@Override
	public void run() {
		synchronized (r2) {
			System.out.println("Thread two acquired resouce 1 Lock");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (r1) {
				System.out.println("Thread one acquired resouce 1 Lock");
			}
		}
		
	}
}
public class Deadlock {

	public static void main(String[] args) throws InterruptedException {
		Resource r1 = new Resource();
		Resource r2 = new Resource();
		
		ThreadOne t1 = new ThreadOne(r1,r2);
		ThreadTwo t2 = new ThreadTwo(r1,r2);
		
		t1.start();
		t2.start();
	}

}
