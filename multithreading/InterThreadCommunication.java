package multithreading;

public class InterThreadCommunication extends Thread{
	int total_earning =0;
	int price   = 100;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				total_earning +=price;
			}
			this.notify();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		InterThreadCommunication itc = new InterThreadCommunication();
		itc.start();
		synchronized (itc) {
			itc.wait();
			System.out.println("Total Earning :"+itc.total_earning);
		}
	}
}
