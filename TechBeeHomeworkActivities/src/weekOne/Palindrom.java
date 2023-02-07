package weekOne;

public class Palindrom {
	
	public static void main (String args[]) {
		
		String str = "Palindrom, DAD";
		
		str.replace(" ", " ");
		
		String reverse = "";
		
		for (int i = str.length() -1; i>=0; i--) {
			
			reverse += str.charAt(i);
			System.out.println(reverse);
		}
		
		
		boolean palindrom = true;
		for ( int i =0; i < str.length(); i++) {
			if (str.charAt(i) != reverse.charAt(i)) {
				
				palindrom =false;
				
			}
			
		}
		if( palindrom) {
			System.out.println("Palindrome!");
		} else {
			System.out.println("Not a Palindrome!");
		}
	}
	

}
