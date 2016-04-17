// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1010

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int code, units;
        float price, total;
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        total = 0;
        for (int i = 0; i < 2; i++) {
            code = scan.nextInt();
            units = scan.nextInt();
            price = scan.nextFloat();
            total += units * price;
        }
        
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }
}