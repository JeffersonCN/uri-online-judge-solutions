// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1020

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dias = scan.nextInt();
               
        int anos = dias / 365;
        dias %= 365;
        int meses = dias / 30;
        dias %= 30;
                
        System.out.println(String.format("%d ano(s)\n%d mes(es)\n%d dia(s)", anos, meses, dias));
    }
}