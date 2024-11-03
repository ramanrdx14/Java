package javainterfaces;

interface InterfaceI1{
	
	default void show() {
		System.out.println("default method");
	}
}
class Test1 implements InterfaceI1{
	
}
public class InterfaceFeatures1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.show();

	}

}
