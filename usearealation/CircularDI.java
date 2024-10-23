package usearealation;

class Aclass{
	Bclass b;
	public void setBclass(Bclass b) {
		this.b = b;
	}
}

class Bclass{
	Aclass a;
	public void setBclass(Aclass a) {
		this.a = a;
	}
}
public class CircularDI {

	public static void main(String[] args) {
		
		Aclass a = new Aclass();
		Bclass b = new Bclass();
		
		a.setBclass(b);
		b.setBclass(a);
	}

}
