package superkeyword;

class X{
	X(){
		System.out.println("X class constructor");
	}
}
class Y extends X{
	Y(){
		super();
		System.out.println("Y class constructor");
	}
	
}
public class SuperTest3 {

	public static void main(String[] args) {
		Y y = new Y();

	}

}
