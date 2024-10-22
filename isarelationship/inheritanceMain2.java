package isarelationship;

class A{
	int a=10;
	public void show() {
		System.out.println("Show");
	}
}
class B extends A{
	
}

public class inheritanceMain2 {
	public static void main(String[] args) {
		A a = new A();
		a.show();
		System.out.println(a.a);
		
		B b = new B();
		b.show();
		System.out.println(b.a);
	}
}


