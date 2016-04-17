// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1008

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        int number = scan.nextInt();
        int hours = scan.nextInt();
        float amountPerHour = scan.nextFloat();
        
        float salary = hours * amountPerHour;
        
        System.out.println(String.format("NUMBER = %d\nSALARY = U$ %.2f", number, salary));
    }
}