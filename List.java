import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        List<Integer> intList = new ArrayList<>();
        
        for(int i=0;i<length;i++){
            intList.add(sc.nextInt());            
        }
        
        int queryLength = sc.nextInt();
        for(int i=0;i<queryLength;i++){
            String query = sc.next();
            if(query.equals("Insert")){
                int position = sc.nextInt();
                int insert = sc.nextInt();
                intList.add(position,insert);
            }
            else{
                int delete = sc.nextInt();
                intList.remove(delete);
            }
        }
        for(Integer i:intList)
            System.out.print(i + " ");    
    }
}
