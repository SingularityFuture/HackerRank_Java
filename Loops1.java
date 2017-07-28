import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        int i;
        int result;
        for(i=1;i<11;i++)
        {
            result = i * N;
            System.out.println(N + " x " + String.valueOf(i) + " = " + String.valueOf(result));
        }
    }
}
