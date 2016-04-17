// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1003

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int soma = a + b;
        System.out.println(String.format("SOMA = %d", soma));
    }
}