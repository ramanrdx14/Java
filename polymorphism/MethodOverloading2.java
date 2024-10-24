package polymorphism;

public class MethodOverloading2 {

	void display(String a) {
		System.out.println("1");
	}
	void display(int a) {
		System.out.println("2");
	}
	public static void main(String[] args) {
		MethodOverloading2 o = new MethodOverloading2();
		o.display(10);
		o.display("");

	}

}
