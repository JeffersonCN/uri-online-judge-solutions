// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1018

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        
        System.out.println(valor);
        for (int nota : notas) {
            int qtde = valor/nota;
            valor %= nota; 
            System.out.println(String.format("%d nota(s) de R$ %.2f", qtde, (float) nota));
        }
    }
}