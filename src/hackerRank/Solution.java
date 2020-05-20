package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	
    	Arrays.sort(arr);
    	Integer x=0,y=0;

         if(arr.length<=4) {
        	 Integer r=0;
        	 for (int i = 0; i < arr.length; i++) {
				r=r+arr[i];
			}
        	 System.out.printf("%d %d ",r,r);
        	 return ;
         }
         
    	for (int i = 0; i < 4; i++) {
			x=x+arr[i];
		}
    	for (int i = arr.length-1; i > arr.length-5 ; i--) {
			y=y+arr[i];
		}
    	
    	System.out.printf("%d %d ",x,y);
    	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
