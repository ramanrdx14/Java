package javainterfaces;
import java.lang.Cloneable;
interface interf1{
	public abstract void show();
}
interface interf2{
	public abstract void show();
}

//With Same Method name
class B implements interf1,interf2,Cloneable{

	public void show() {
		System.out.println("Show Called");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class MultipleInteritance2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		B b = new B();
		b.show();
		
		B b1 =(B) b.clone();
		
		b1.show();
		
	}

}