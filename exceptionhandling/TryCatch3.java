package exceptionhandling;

public class TryCatch3 {

	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println(100/0);
			System.out.println("2");
		}catch(ArithmeticException e) {
			System.out.println("3.1");
		}
		catch (Exception e) {
			System.out.println("3.2");
		}
		System.out.println("4");
	}

}
