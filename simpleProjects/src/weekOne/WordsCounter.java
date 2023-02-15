package weekOne;

import java.util.Scanner;

public class WordsCounter {
	public static void main (String args[]) {
		
		System.out.println("Enter a Sentence");
		
		Scanner wordScanner = new Scanner(System.in);
		
		String sentence = wordScanner.nextLine();
		
		int count = 1;
		
		for ( int i = 0; i < sentence.length()-1; i++) {
			
			if ((sentence.charAt(i) == ' ') && (sentence.charAt(i+1) != ' ')) {
				
				count++;
			}
			
		}
		System.out.println("Number of words in your sentence is:" + count);
		
		
	}

}
