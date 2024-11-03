package javainterfaces;

public interface Vehicle {
	public static final int tyres = 8;
	public abstract void start();
	public abstract void changeGear(int a);
}

class Bus implements Vehicle{
	public void start() {
		System.out.println("Started");
	}
	
	public void changeGear(int a) {
		System.out.println("Gear ->"+a);
	}
}
class Test{
	public static void main(String[] args) {
		Bus b = new Bus();
		b.start();
		b.changeGear(1);
		
		Vehicle b1 = new Bus(); // we can use reference of interface
		b.start();
		b.changeGear(5);
	}
}
