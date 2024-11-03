package javainterfaces;

interface i1{
	public abstract void show1();
}
interface i2{
	public abstract void show2();
}

//With Different Method name
class A implements i1,i2{

	@Override
	public void show2() {
		System.out.println("Show 1");
		
	}

	@Override
	public void show1() {
		System.out.println("Show 2");
		
	}
	
}

public class MultipleInteritance {
	public static void main(String[] args) {
		A a = new A();
		a.show1();
		a.show2();
	}

}
