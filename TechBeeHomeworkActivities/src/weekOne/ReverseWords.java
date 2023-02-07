package weekOne;

public class ReverseWords {
	
	public static void main (String args[]) {
		
		
		String Str = "Words to be Reversed";
		
		String[] words = Str.split(" ");
		
		String reverseSting = "";
		
		
		for (String w: words ) {
			
			String reverseWord = "";
			
			for (int i = w.length()-1; i>=0; i--) {
				
				reverseWord = reverseWord + w.charAt(i);
				
			}
			reverseSting = reverseSting + reverseWord + " ";
		}
		
		System.out.println(reverseSting);
	}

}
