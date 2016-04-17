// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1004

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int prod = a * b;
        System.out.println(String.format("PROD = %d", prod));
    }
}