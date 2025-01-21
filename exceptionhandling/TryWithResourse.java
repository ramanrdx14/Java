package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.PrintWriter;

public class TryWithResourse {

	public static void main(String[] args) {
		
		//this will automatically close the resource
		try(FileInputStream fis = new FileInputStream("");PrintWriter pw = new PrintWriter(""))  // this is resourse block
		{
			
			fis.read();
			pw.write("");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
