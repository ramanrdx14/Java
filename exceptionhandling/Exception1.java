package exceptionhandling;

public class Exception1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String a = null;
		System.out.println(1); //normal flow
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		
		System.out.println(a.charAt(0));//nullpointer exception
		System.out.println(10/0); //arithematic excepion
		
		System.out.println(5);//normal flow
		System.out.println(6);

	}

}
