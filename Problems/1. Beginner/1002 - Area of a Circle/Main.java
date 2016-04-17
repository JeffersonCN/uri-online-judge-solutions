// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1002

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        final double pi = 3.14159;
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        double radius = scan.nextDouble();
        double area = pi * radius * radius;
        System.out.println(String.format("A=%.4f", area));
    }
}