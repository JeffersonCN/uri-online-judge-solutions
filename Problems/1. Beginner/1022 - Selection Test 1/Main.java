// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1022

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        
        boolean condicoes = (b > c) 
                         && (d > a)
                         && (c + d > a + b)
                         && (c > 0)
                         && (d > 0)
                         && (a % 2 == 0);
        
        System.out.println(condicoes ? "Valores aceitos" : "Valores nao aceitos");
    }
}