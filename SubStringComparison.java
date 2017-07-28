import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String string = sc.next();
        int k = sc.nextInt();
        String min = string.substring(0,k);
        String max = min;
        String current = "";
        
        for(int i=1;i<string.length()-k+1;i++){
            current = string.substring(i,i+k);
            if(min.compareTo(current) > 0)
                min = current;
            if(max.compareTo(current) < 0)
                max = current;
        }
        System.out.println(min);
        System.out.println(max);        
    }
}
