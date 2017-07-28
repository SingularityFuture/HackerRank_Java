import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] array = new int[n];
        int count = 0;
        int sum;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            sum=0;
            for(int j=i;j>=0;j--){
                sum = sum + array[j];
                if(sum<0)
                    count++;
            }
        }
        
        System.out.println(count);      
      
       
    }
}
