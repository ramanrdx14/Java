package exceptionhandling;

public class Voting {
	public void checkAge(int age){
		if(age<18) {
			throw new RuntimeException("Not valid age");
		}
		System.out.println("You can vote");
	}
	public static void main(String[] args) {
		Voting v = new Voting();
		v.checkAge(10);

	}

}
