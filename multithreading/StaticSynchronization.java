package multithreading;

class BusBooking{
	static int total_seats = 10;
	static synchronized public void bookSeat(int seats) {
		
		if(total_seats>=seats) {
			System.out.println("Seats Booked Sucessfully");
			total_seats -=seats;
			System.out.println("Rem Seats :"+total_seats);
		}else {
			System.err.println("Seats Booking failed");
			
		}
	}
}
class MT1 extends Thread{
	BusBooking obj;
	int seats;
	public MT1(int seats,BusBooking obj) {
		this.obj = obj;
		this.seats = seats;
	}
	@Override
	public void run() {
		obj.bookSeat(seats);
	}
}
class MT2 extends Thread{
	BusBooking obj;
	int seats;
	public MT2(int seats,BusBooking obj) {
		this.obj = obj;
		this.seats = seats;
	}
	@Override
	public void run() {
		obj.bookSeat(seats);
	}
}
public class StaticSynchronization {

	public static void main(String[] args) {
		
		BusBooking b1 = new BusBooking();
		MT1 t1 = new MT1(5, b1);
		MT1 t2 = new MT1(11,b1);
		

		BusBooking b2 = new BusBooking();
		MT2 t3 = new MT2(6, b2);
		MT2 t4 = new MT2(3,b2);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
