package isarelationship;
class X{
	public void show1() {
		System.out.println("Show1");
	}
}
class Y extends X{
	public void show2() {
		System.out.println("Show2");
	}
}
class Z extends X{
	public void show3() {
		System.out.println("Show3");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Y y = new Y();
		y.show1();
		y.show2();
		
		
		Z z = new Z();
		z.show1();
		z.show3();
	}

}
