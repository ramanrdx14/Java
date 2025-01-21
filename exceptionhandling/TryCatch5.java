package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatch5 {

	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println(100/0);
			FileInputStream fis = new FileInputStream("");
		}catch(ArithmeticException e) {
			System.out.println("3.1");
		}catch(FileNotFoundException e) {
			System.out.println("file not found");
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}catch(Throwable t) {
			System.out.println(t);
		}
		
		
	}

}
