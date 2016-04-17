// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1005

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        double a = scan.nextDouble();
        double b = scan.nextDouble();       
        double media = ((a*3.5) + (b*7.5))/11;
        System.out.println(String.format("MEDIA = %.5f", media));
    }
}