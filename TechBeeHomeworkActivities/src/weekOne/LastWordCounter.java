package weekOne;

import java.util.*;
public class LastWordCounter {
public int endingInsandy(String str) 
{
  int l = str.length();
  int ctr = 0;
  str = str.toLowerCase();
  
  for (int i = 0; i < l; i++) {
	  
    if (str.charAt(i) == 's' || str.charAt(i) == 'y') {
    	
      if (i < l-1 && !Character.isLetter(str.charAt(i+1)))
        ctr++;
      else if (i == l-1)
        ctr++;
      
	}
  }
  return ctr;
}

public static void main (String[] args) { 
	
	LastWordCounter m= new LastWordCounter();
      String str1 =  "Yes,it is my day";
      System.out.println("The given string is: " +str1);
      System.out.println("Words that end in  y and s are: "+m.endingInsandy(str1));
	  }
}