// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1012

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        final double pi = 3.14159;
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();
        
        float triangle = (a*c)/2;
        double circle = pi * c * c;
        float trapezium = ((a + b) * c)/2;
        float square = b*b;
        float rectangle = a*b;
        
        System.out.println(String.format(
            "TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f", 
            triangle,
            circle,
            trapezium,
            square,
            rectangle
        ));
    }
}