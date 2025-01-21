package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {

	public static void main(String[] args) throws FileNotFoundException {
		m1();

	}
	public static void m1() throws FileNotFoundException {
		m2();
	}
	public static void m2() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("");
	}

}
