// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1009

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        String name = scan.next();
        double fixedSalary = scan.nextDouble();
        double totalSales = scan.nextDouble();
        
        double salary = fixedSalary + totalSales*0.15;
        
        System.out.println(String.format("TOTAL = R$ %.2f", salary));
    }
}