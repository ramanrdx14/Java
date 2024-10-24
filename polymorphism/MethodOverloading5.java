package polymorphism;

public class MethodOverloading5 {
	public void display(int a) {
		System.out.println("First Method"+a);
	}
	public void display(int... a) {
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		MethodOverloading5 m = new MethodOverloading5();
		m.display();
		m.display(10);
		m.display(10,20);
		m.display(10,20,30);
	}

}
