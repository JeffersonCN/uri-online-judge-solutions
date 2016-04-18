// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1019

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int segundos = scan.nextInt();
        
        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;
                
        System.out.println(String.format("%d:%d:%d", horas, minutos, segundos));
    }
}