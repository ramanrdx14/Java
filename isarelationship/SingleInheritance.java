package isarelationship;

class Animal {
	public void eat() {
		System.out.println("Eat Method");
		// 100 lines of code
	}
}
class Human extends Animal{
	
	public void run() {
		System.out.println("Human is running");
	}
	
}
public class SingleInheritance{
	public static void main(String[] args) {
		Animal cat = new Animal();
		cat.eat();
		
		Human raman= new Human();
		raman.run();
		raman.eat();
	}
}
