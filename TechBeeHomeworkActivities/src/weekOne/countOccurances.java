package weekOne;

import java.util.Scanner;

class countOccurances {
    
public static void main(String args[]) {
    	
    	Scanner occuranceScanner = new Scanner(System.in);
    	
    	 int occ = 0;
        int numsArray[] = {20, 13, 20, 15, 31,  15 ,8, 20};
        int num = numsArray.length;
        int x = 0;
        for (int i=0; i<num; i++) {
            if (x == numsArray[i])
              occ++;
       System.out.println(occ);
        }
        
        System.out.println();
    }
}