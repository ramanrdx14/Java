package multithreading;

class Th1 extends Thread{
	@Override
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println("hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
public class InterruptExample {
	
	public static void main(String[] args) {
		
		Th1 t = new Th1();
		t.start();
		t.interrupt();
	}

}
