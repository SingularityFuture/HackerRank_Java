import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);        
        int a;
        int b;
        int answer;
        
        try{
            a = sc.nextInt();
            b = sc.nextInt();
            answer = a/b;
            System.out.println(answer);
            }
        catch(ArithmeticException e){
            System.out.println(e.getClass().getCanonicalName() + ": " + e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getCanonicalName());
        }        
    }
}
