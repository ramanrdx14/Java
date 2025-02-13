package stringscomplete;

public class Stringdemo1 {

	public static void main(String[] args) {
		String s = new String("raman");
		System.out.println(s);
		
		byte[] arr = {97,98,99};
		System.out.println(new String(arr));
		
		char[] ch  = {'a','b'};
		System.out.println(new String(ch));
	}

}
