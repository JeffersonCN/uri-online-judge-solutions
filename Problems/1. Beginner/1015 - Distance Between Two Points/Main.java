// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1015

import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.println(String.format("%.4f", distance));
    }
}