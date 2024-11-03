package thiskeyword;

public class ThisKeywordDemo {
	public ThisKeywordDemo() {
		System.out.println(this);
	}
	public static void main(String[] args) {
		ThisKeywordDemo d = new ThisKeywordDemo();
		System.out.println(d);

	}

}
