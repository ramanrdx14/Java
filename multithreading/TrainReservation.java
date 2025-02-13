package multithreading;

class BookSeat{
	int total_seats=10;
	synchronized public void bookSeat(int seats,String name) {
		if(total_seats >= seats) {
			System.out.println(name+" Booked "+seats+" seats !");
			total_seats-=seats;
			System.out.println("Remaining Seats :"+(total_seats));
		}else {
			System.err.println(name+" is not able to Booked "+seats+" seats !");
			System.err.println("Remaining Seats :"+(total_seats));
		}
	}
}

class CustomThread extends Thread{
	BookSeat bs;
	String name ;
	int seats;
	public CustomThread(BookSeat bs,String name,int seats) {
		this.name = name;
		this.bs = bs;
		this.seats = seats;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		bs.bookSeat(seats,Thread.currentThread().getName());
	}
}
public class TrainReservation {

	public static void main(String[] args) {
		BookSeat bs     = new BookSeat();
		CustomThread ritik  = new CustomThread(bs,"ritik",5);
		ritik.start();
		
		CustomThread kartik = new CustomThread(bs,"kartik",4);
		kartik.start();
		
		CustomThread sunny  = new CustomThread(bs,"sunny",3);
		sunny.start();
	}	

}
