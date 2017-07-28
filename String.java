import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        s = s.trim();
        String[] parts = s.split("[ !,?._'@]+");        
        if(s.length()>0){
            System.out.println(parts.length);
            for(String word:parts){
                System.out.println(word);
            }
        } else if (s.length()==0){
            System.out.println("0");
        } 
                   
    }
}
