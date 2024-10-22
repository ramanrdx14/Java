package objectcreation;

public class Animal {
	
	public static void main(String[] args) {
		Animall a = new Animall();
		System.out.println("Reference Value :"+a);
		System.out.println("HashCode :"+a.hashCode());
	}

}
class Animall {
	
	int legs;
	int color;

}

