package javainterfaces;
interface InterfaceI2{
	
	static void show() {
		System.out.println("static method");
	}
}
class Test2 implements InterfaceI1{
	
}

public class InterfaceFeatures2 {

	public static void main(String[] args) {
		InterfaceI2.show();

	}

}
