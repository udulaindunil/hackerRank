import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
public class Solution {


    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String listTime[] = s.split(":");
        String hour = listTime[0];
        String minutes = listTime[1];
        String secounds = listTime[2].substring(0, 2);
        String caser = listTime[2].substring(2, 4);
        if(caser.equals("AM")){
            if(hour.equals("12"))
                   hour="00";

            System.out.println(hour+":"+minutes+":"+secounds);
             bw.write(hour+":"+minutes+":"+secounds);
        }else{
            if(!hour.equals("12")){
                int h = Integer.parseInt(hour); 
                h = h +12; 
                hour =""+h; 
            }
            System.out.println(hour+":"+minutes+":"+secounds);
            bw.write(hour+":"+minutes+":"+secounds);
        }

      
       bw.newLine();

        bw.close();
    }
}
