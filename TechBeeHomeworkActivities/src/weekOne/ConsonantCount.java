package weekOne;
//import java.util.*;

import java.util.Scanner;


public class ConsonantCount {

	public static void main(String[] args) {
		
		
String str = "StingToIdentifyVowelsAndConsonants";
		
//		String lcString = str.toLowerCase();
		countConsonants(str);
	
	}
	private static void countConsonants(String str) {
		
		int vowelCount = 0;
		int consonantCount = 0;
		
		for ( int i = 0; i <str.length(); i++) {
			if (isVowel(str.charAt(i))) {
				
				vowelCount++;
			} else {
				consonantCount++;
			}
		}
		
		
		System.out.println("The number of vowels in your sentence is:" + vowelCount );
		System.out.println("The number of consonants in your sentence is:" + consonantCount );
		
	}

	private static boolean isVowel(char ch) {
		
		ch = Character.toUpperCase(ch);
		return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
	}

}

