package polymorphism;

public class MethodOverloading1 {
	void display() {
		System.out.println("1");
	}
	void display(int a) {
		System.out.println("2");
	}
	void display(int a,int b) {
		System.out.println("2");
	}
	public static void main(String[] args) {
		MethodOverloading1 o = new MethodOverloading1();
		o.display();
		o.display(10);
		o.display(20);

	}

}
