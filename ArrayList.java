import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        List<List<Integer>> numbers = new ArrayList<List<Integer>>(lines);
        int digits;
        for(int i=0;i<lines;i++){
            digits = sc.nextInt();
            List<Integer> individual_numbers = new ArrayList<>(digits);
            for(int j=0;j<digits;j++){
                individual_numbers.add(sc.nextInt());
            }
            numbers.add(individual_numbers);
        }        
        int queries = sc.nextInt();
        int line_query;
        int position_query;
        int answer;
        for(int i=0;i<queries;i++){
            line_query=sc.nextInt();
            position_query=sc.nextInt();
            if(position_query <= numbers.get(line_query-1).size()){
                answer = numbers.get(line_query-1).get(position_query-1);
                System.out.println(answer);
            }
            else{
                System.out.println("ERROR!");
            }
        }      
        
    }
}
