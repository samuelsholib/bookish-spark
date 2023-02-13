package weekOne;

//public class RightRotate {
//
//	public static void main(String[] args) {
//		
//		
//	String str = "Rose";
//	
//	char[] cha = str.toCharArray();
//	
//	int chaLength = cha.length;
//	
//	char lastChar = cha[chaLength -1];
//	
//	
//	cha[0] = lastChar;
//	
//	StringBuffer charBuffer = new StringBuffer();
//	
//	for ( char ca: cha ) {
//		
//	charBuffer.append(ca);
//	}
//	
//	System.out.println(charBuffer);
//
//}
//}


import java.util.*;
import java.io.*;
 public class RotateWords{
       
	 static String leftrotate(String str, int d){
    	
            String ans = str.substring(d) + str.substring(0, d);
            return ans;
    }
 
    static String rightrotate(String str, int d){
    	
            return leftrotate(str, str.length() - d);
    }
    public static void main(String args[]){
          String str1 = "rotatetoright";
            System.out.println(leftrotate(str1, 2));
 
            String str2 = "rotatetoleft";
            System.out.println(rightrotate(str2, 2));
    }
}
 
