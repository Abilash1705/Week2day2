package Week2.Day2;

public class Odd {
	public static void main(String[] args) {
		String word="cheemsmeme";
		char[]Letter=word.toCharArray();
		int Length =Letter.length;
		for (int i = 0; i < Letter.length; i++) {
			
			if(i%2!=0) {
				String strcpy="";
				strcpy=strcpy+Letter[i];
				System.out.println(strcpy.toUpperCase());
				
			}else
			{
				System.out.println(Letter[i]);
			}
			}
	}
	}

