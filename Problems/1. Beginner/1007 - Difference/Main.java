// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1007

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int diferenca = a*b-c*d;
        System.out.println(String.format("DIFERENCA = %d", diferenca));
    }
}