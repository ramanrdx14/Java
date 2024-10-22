package isarelationship;

class AA{
	public void show1() {
		System.out.println("Show1");
	}
}
class BB extends AA{
	public void show2() {
		System.out.println("Show2");
	}
}
class CC extends BB{
	public void show3() {
		System.out.println("Show3");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		CC cc = new CC();
		cc.show3();
		cc.show2();
		cc.show1();
	}

}
