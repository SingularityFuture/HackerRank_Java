import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        int ops = sc.nextInt();
        
        BitSet[] bits = {new BitSet(length), new BitSet(length)};        
        
        for(int i=0;i<ops;i++){
            String op = sc.next();
            int arg1 = sc.nextInt();
            int arg2 = sc.nextInt();
            switch(op){ 
                case "AND":
                    bits[arg1-1].and(bits[arg2-1]);
                    System.out.println(bits[0].cardinality() + " " + bits[1].cardinality());
                    break;
                case "OR":
                    bits[arg1-1].or(bits[arg2-1]);
                    System.out.println(bits[0].cardinality() + " " + bits[1].cardinality());
                    break;
                case "XOR":
                    bits[arg1-1].xor(bits[arg2-1]);
                    System.out.println(bits[0].cardinality() + " " + bits[1].cardinality());
                    break;
                case "FLIP":
                    bits[arg1-1].flip(arg2);
                    System.out.println(bits[0].cardinality() + " " + bits[1].cardinality());
                    break;
                case "SET":
                    bits[arg1-1].set(arg2);
                    System.out.println(bits[0].cardinality() + " " + bits[1].cardinality());
                    break;
            }            
        }
    }
}
