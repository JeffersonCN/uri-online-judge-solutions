// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1017

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int time = scan.nextInt();
        int speed = scan.nextInt();
        float distance = time * speed;
        float liters = distance / 12;
             
        System.out.println(String.format("%.3f", liters));
    }
}