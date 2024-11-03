package statickeyword;

class PageVisiters{
	static int count =0;
	public PageVisiters() {
		count++;
	}
}
public class StaticDemo1 {

	public static void main(String[] args) {
		
		PageVisiters p1 = new PageVisiters();
		PageVisiters p2 = new PageVisiters();
		PageVisiters p3 = new PageVisiters();
		PageVisiters p4 = new PageVisiters();
		
		System.out.println(PageVisiters.count);
	}

}
