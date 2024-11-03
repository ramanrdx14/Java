package superkeyword;

class L{
	void show() {
		System.out.println("Iam in L class");
	}
}
class M extends L{
	void show() {
		super.show();
		System.out.println("Iam in M class");
	}
}
public class SuperTest2 {

	public static void main(String[] args) {
		
		M m = new M();
		m.show();
	}

}
