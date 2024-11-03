package thiskeyword;

public class ThisKeywordDemo2 {

	String name;
	String roll;
	public ThisKeywordDemo2(String name,String roll) {
		this.name = name;
		this.roll = roll;
		this.show(); //calling method with this
	}
	public void show() {
		System.out.println(this.name+" "+this.roll);
	}
	public static void main(String[] args) {
		ThisKeywordDemo2 th = new ThisKeywordDemo2("Raman","101");
	}

}
