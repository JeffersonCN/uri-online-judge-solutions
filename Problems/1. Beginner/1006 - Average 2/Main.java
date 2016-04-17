// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1006

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double media = ((a*2) + (b*3) + (c*5))/10;
        System.out.println(String.format("MEDIA = %.1f", media));
    }
}