package Week2.Day2;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text="Java is an Platfom Indipendent Language";
		String[]sp=text.split(" ");
		for (int i = 0; i < sp.length; i++) {
			for (int j = i+1; j < sp.length; j++) {
				
			
			if(sp[i].equals(sp[j])) {
				sp[j]="";
				
			}	
			}
			System.out.println(" "+sp[i]);
		}
	}

}
