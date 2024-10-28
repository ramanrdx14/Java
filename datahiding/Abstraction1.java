package datahiding;

abstract class Vehicle{
	abstract void start();
}
class Car extends Vehicle{

	@Override
	void start() {
		System.out.println("Start with Self");
		
	}
	
}
class Bike extends Vehicle{

	@Override
	void start() {
		System.out.println("Start with Self");
		System.out.println("Start with kick");
		
	}
	
}
public class Abstraction1 {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.start();
		
		Car c  = new Car();
		c.start();

	}

}
