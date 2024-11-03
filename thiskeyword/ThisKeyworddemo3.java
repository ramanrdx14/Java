package thiskeyword;

public class ThisKeyworddemo3 {
	ThisKeyworddemo3(){
		this(10);  //Calling 1args constructor
		System.out.println("0-args Constructor");
	}
	ThisKeyworddemo3(int a){
		System.out.println("1-args Constructor");
	}
	
	public static void main(String[] args) {
		ThisKeyworddemo3 th = new ThisKeyworddemo3();
		
	}

}
