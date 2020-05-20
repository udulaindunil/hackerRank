package hackerRank;



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    		
    		Integer pos=0,neg=0,zer=0;
    		Double positive,zero,negetive;
    		
    		    		
    		for (int i = 0; i < arr.length; i++) {
				if(arr[i]>0) {
					pos++;
				}else if(arr[i]<0) {
					neg++;
				}else {
					zer++;
				}
			}
    		
    		positive = Double.valueOf(pos)/arr.length;
    		negetive = Double.valueOf(neg)/arr.length;
    		zero = Double.valueOf(zer)/arr.length;
    		
    		System.out.println(positive);
    		System.out.println(negetive);
    		System.out.println(zero);
    		
    		

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}