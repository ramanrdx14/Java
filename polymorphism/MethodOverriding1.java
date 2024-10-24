package polymorphism;

class Parent{
	public void marry() {
		System.out.println("Arrange Marraige");
	}
	
}
public class MethodOverriding1 extends Parent{
	@Override
	public void marry() {
		System.out.println("Love Marraige");
	}
	
	public void display() {
		System.out.println("Display");
	}
	public static void main(String[] args) {
		Parent            p = new Parent();
		p.marry();
		MethodOverriding1 m = new MethodOverriding1();
		m.marry();
		
		Parent            o = new MethodOverriding1();
		o.marry();
		//o.display();   This is give me error becasue this is not overriding
		
	}

}
