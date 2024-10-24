package polymorphism;

public class MethodOverloading6 {
	public void display(Object o) {
		System.out.println(o);
	}
	public void display(String s) {
		System.out.println(s);
	}
	public void display(StringBuffer s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		MethodOverloading6 m = new MethodOverloading6();
		//m.display(null);  //Error because [sb and s] same level par hai
		
	}

}
