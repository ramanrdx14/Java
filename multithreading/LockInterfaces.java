package multithreading;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class BookBusSeat{
	int totalseats = 10;
	ReentrantLock re = new ReentrantLock();
	public void bookSeat(int seats) {
		re.lock();
		if(totalseats>=seats) {
			System.out.println("Seat Booked");
			totalseats-=seats;
			System.out.println("Rem sets"+totalseats);
		}else {
			System.err.println("Failed to book seats");
			System.out.println("Rem sets"+totalseats);
		}
		re.unlock();
	}
	
}
class ThreadA extends Thread{
	BookBusSeat b;
	int seat;
	public ThreadA(BookBusSeat b,int seat) {
		this.b = b;
		this.seat = seat;
	}
	public void run() {
		b.bookSeat(seat);
	}
}
public class LockInterfaces {
	
	public static void main(String[] args) {
		BookBusSeat b = new BookBusSeat();
		ThreadA t1 = new ThreadA(b,4);
		ThreadA t2 = new ThreadA(b,7);
		ThreadA t3 = new ThreadA(b,7);
		t1.start();
		t2.start();
		t3.start();
	}

}
