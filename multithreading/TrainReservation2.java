package multithreading;

class BookSeat1{
	int total_seats=10;
	 public void bookSeat(int seats,String name) {
		 
		 synchronized (this) {
			 
			 
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
}

class CustomThread1 extends Thread{
	BookSeat1 bs;
	String name ;
	int seats;
	public CustomThread1(BookSeat1 bs,String name,int seats) {
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
public class TrainReservation2 {

	public static void main(String[] args) {
		BookSeat1 bs     = new BookSeat1();
		CustomThread1 ritik  = new CustomThread1(bs,"ritik",5);
		ritik.start();
		
		CustomThread1 kartik = new CustomThread1(bs,"kartik",4);
		kartik.start();
		
		CustomThread1 sunny  = new CustomThread1(bs,"sunny",3);
		sunny.start();
	}	

}

