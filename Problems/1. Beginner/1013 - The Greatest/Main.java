// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1013

import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        
        System.out.println(String.format("%d eh o maior", maiorABC));
    }
}