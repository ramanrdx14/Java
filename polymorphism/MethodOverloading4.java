package polymorphism;

public class MethodOverloading4 {
	/*void display(char ch) {
		System.out.println(ch);
	}
	*/
	
	void display(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
	  MethodOverloading4 mo = new MethodOverloading4();
	  mo.display('d'); //Automatic type permotion
	  
	  //Bye short int long float double boolean
	  //		   ^
	  //		   |
	  //         char
	}

}
