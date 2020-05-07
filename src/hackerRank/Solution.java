package hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
    
//    	HashMap<Integer, Integer> capitalCities = new HashMap<Integer, Integer>();
    	
    	Map<Character, Integer> map = new HashMap<>();
    	Map<Character, Integer> map2 = new HashMap<>();
    	
    	
    	 Scanner scan = new Scanner(System.in);
         String a = scan.next();
         String b = scan.next();
         a=a.toLowerCase();
         b=b.toLowerCase();
         
         char[] s1 = a.toCharArray();
         char[] s2 = b.toCharArray();
         
         int[] c1 = new int[s1.length];
         int[] c2 = new int[s2.length];
         
         
         
         
    
         
         for (int i = 0; i < s1.length; i++) {
        	 char x = s1[i];
             if( ! map.containsKey(x)){
                 map.put( x, 1 );
             } else {
                 Integer frequency = map.get( x );
                 map.put( x, ++frequency );
             }
             
		}
         
         for (int i = 0; i < s2.length; i++) {
        	 char x = s2[i];
             if( ! map2.containsKey(x)){
                 map2.put( x, 1 );
             } else {
                 Integer frequency = map2.get( x );
                 map2.put( x, ++frequency );
             }
             
		}
         
         for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        	 
        	 	char x = entry.getKey(); 
        	 	
        	 	int y = entry.getValue(); 
        	 	
        	   if(map2.containsKey(x)) {
        		   if(map2.get(x)==y) {
        			   
        		   }else {
        			   System.out.println("No");
        		   }
        	   }

        	 
         }
         
         
         
         
         System.out.println("Yes");
         
       
    	
    }
}
