package exceptionhandling;
import java.util.*;
public class UserDefinedExceptions {

	public static void main(String[] args) throws InvalidAge {
		
		Scanner sc = new Scanner(System.in);
		int  n     = sc.nextInt();
		if(n<18) {
			throw new InvalidAge("Invalid Age");
		}
		System.out.println("Age is goood");
	}
	

}
class InvalidAge extends Exception {
	public InvalidAge(String msg) {
		super(msg);
	}
	
}
