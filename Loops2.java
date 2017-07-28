import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int index;
        int result;
        int j;
        for(int i=0; i<t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(index=1;index<=n;index++){
                result = 0; // Initialize result
                for(j=1;j<=index;j++){
                    result = result + (int) Math.pow(2,j-1);
                }
                result = (result * b) + a;
                System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
