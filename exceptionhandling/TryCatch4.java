package exceptionhandling;

public class TryCatch4 {

	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println(100/0);
			System.out.println("2");
		}catch(Exception e) {
			System.out.println("3.1");
		}
		/*catch (ArithmeticException e) {   this wil not execute because parent catch block is alredy  there 
			System.out.println("3.2");
		}
		System.out.println("4");
		*/
	}

}
