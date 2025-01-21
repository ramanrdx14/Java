package exceptionhandling;

public class TryFinally1 {

	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println("2");
			System.out.println(10/0);
		}finally {
			System.out.println("3");
		}

	}

}
