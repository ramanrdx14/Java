package exceptionhandling;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws IOException {
		//For this we have to either use try-catch or throws keyword because it is checked Exceptio
		FileInputStream fis = new FileInputStream("");
		fis.read();

	}

}
