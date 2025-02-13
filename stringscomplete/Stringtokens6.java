package stringscomplete;

import java.util.StringTokenizer;

public class Stringtokens6 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hello How Are you ");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
