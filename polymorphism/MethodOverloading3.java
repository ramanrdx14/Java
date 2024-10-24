package polymorphism;

public class MethodOverloading3 {

	void display(String a,int b) {
		System.out.println("1");
	}
	void display(int b,String a) {
		System.out.println("2");
	}
	public static void main(String[] args) {
		MethodOverloading3 o = new MethodOverloading3();
		o.display(null,0);
		o.display(0, null);
	}

}
