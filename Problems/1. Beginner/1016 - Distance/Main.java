// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1016

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int distancia = scan.nextInt();
        int tempo = distancia * 2;
        
        System.out.println(String.format("%d minutos", tempo));
    }
}