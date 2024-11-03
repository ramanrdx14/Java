package superkeyword;

class A{
	int no=10;
}
class B extends A{
	int no=20;
	public void show(int no) {
		//System.out.println(no);
		//System.out.println(this.no);
		//System.out.println(super.no);
	}
}
public class SuperTest {

	public static void main(String[] args) {
		B b = new B();
		b.show(30);

	}

}
