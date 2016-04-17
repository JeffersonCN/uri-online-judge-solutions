// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1011

import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        final double pi = 3.14159;
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        int radius = scan.nextInt();
        double volume = (4 * pi * Math.pow(radius,3)) / 3;
        
        System.out.println(String.format("VOLUME = %.3f", volume));
    }
}