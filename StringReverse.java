import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        /*for(int i = 0; i<A.length(); i++){
            A.charAt(i);
        }*/
        
        String reverse = new StringBuilder(A).reverse().toString();
        
        if(A.equals(reverse)){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
        
    }
}
