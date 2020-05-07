package hackerRank;


import java.util.Scanner;


public class Solution {
	
    public static String stringCompare(String str1,String str2) { 
        
        int retval = str1.compareTo(str2);
        // prints the return value of the comparison
        if (retval < 0) {
           return "No";
        } else if (retval == 0) {
            return "No";
          
        } else {
            return "Yes";
          
        }
    
}
    
    public static int stringSize(String str1,String str2) {
        
        return str1.length()+str2.length();
    } 
    
    
    public static String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    
    public static String toUpper(String str1,String str2) {
        
        return capitalize(str1)+" "+capitalize(str2) ;
    }
    
    
    

    public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);
         String A=sc.next();
         String B=sc.next();
         A = A.toLowerCase();
         B= B.toLowerCase();
         
        System.out.println(stringSize(A,B));
        System.out.println(stringCompare(A,B));
        System.out.println(toUpper(A,B));
         
         
         
    }

}
