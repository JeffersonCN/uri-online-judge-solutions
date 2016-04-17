// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1014

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        final double pi = 3.14159;
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        int x = scan.nextInt();
        float y = scan.nextFloat();
        float consumption = x / y;
        
        System.out.println(String.format("%.3f km/l", consumption));
    }
}