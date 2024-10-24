package polymorphism;

class A{
	public void show(int a) {
		System.out.println("Show A :"+a);
	}
}
class B extends A{
	public void show(int b) {
		System.out.println("Show B :"+b);
	}
}
public class MethodOverriding2 {

	public static void main(String[] args) {
	
		A a = new A();
		a.show(10);
		
		B b = new B();
		b.show(10);
		
		A a1 = new B(); //Upcasting
		a1.show(10);
		
		
		A obj = new B(); // Downcasting
		B obj1 = (B)obj;
		obj1.show(20);
		
	}

}
