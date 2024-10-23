package usearealation;
class A{
	B aa;
	A(B b){
		aa = b;
	}
}

class B{
	String bb;
	public B(String b) {
		bb = b;
	}
}
public class ConstructorBasedDI {
	
	public static void main(String[] args) {
		B b = new B("");
		A a = new A(b);
		
	}

}
