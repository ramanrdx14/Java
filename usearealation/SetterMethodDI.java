package usearealation;

class AA{
	BB b;
	public void setB(BB bb) {
		b = bb;
	}
}
class BB{
	
}
public class SetterMethodDI {

	public static void main(String[] args) {
		
		AA aa = new AA();
		BB bb = new BB();
		aa.setB(bb);
	}

}
