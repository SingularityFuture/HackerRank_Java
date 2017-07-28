import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        Locale USLocale = new Locale("en", "US");
		NumberFormat USFormat = NumberFormat.getCurrencyInstance(USLocale);
        
        Locale IndiaLocale = new Locale("en", "IN");
		NumberFormat IndiaFormat = NumberFormat.getCurrencyInstance(IndiaLocale);
        
        Locale ChinaLocale = new Locale("zh", "CN");
		NumberFormat ChinaFormat = NumberFormat.getCurrencyInstance(ChinaLocale);
        
        Locale FranceLocale = new Locale("fr", "FR");
		NumberFormat FranceFormat = NumberFormat.getCurrencyInstance(FranceLocale);
        
        System.out.println("US: " + USFormat.format(payment));
        System.out.println("India: " + IndiaFormat.format(payment));
        System.out.println("China: " + ChinaFormat.format(payment));
        System.out.println("France: " + FranceFormat.format(payment));
    }
}
