package Week2.Day2;

import java.util.Arrays;

public class Anargam {
	public static void main(String[] args) {
		String text1="bus";
		String text2="stop";
		if(text1.length()==text2.length()) {
			char[] Array1=text1.toCharArray();
			char[] Array2=text2.toCharArray();
			Arrays.sort(Array1);
			Arrays.sort(Array2);
			boolean result=Arrays.equals(Array1, Array2);
			if(result=true) {
				System.out.println(text1+" and"+text2);
			}
			else {
				System.out.println(text1+" and"+text2);
			}
		}
	}

}
