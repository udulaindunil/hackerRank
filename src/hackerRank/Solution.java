package hackerRank;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution {
	
    public static String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    
		
    public static void main(String[] args) {
    	        

        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
           
            	  while (m.find()) {
                      input = input.replaceAll(m.group(), m.group(1));
                  }
            	  
            	  if (!m.find()) {
                  	
                 	 System.out.println(input);
            	  }else {
            		  
            		  System.out.println(capitalize(input));
            	  }                
            
        }
        
        in.close();
    }

}
