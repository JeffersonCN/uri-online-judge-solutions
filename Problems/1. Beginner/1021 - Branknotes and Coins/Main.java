// PROBLEM URL: https://www.urionlinejudge.com.br/judge/en/problems/view/1021

import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        float valor = scan.nextFloat();
        
        int valorInteiro = (int) Math.floor(valor);
        double valorQuebrado = arredonda2Casas(valor - valorInteiro);
        
        int[] notas = {100, 50, 20, 10, 5, 2};
        float[] moedas = {1f, 0.5f, 0.25f, 0.1f, 0.05f, 0.01f};
        
        System.out.println("NOTAS:");
        for (int nota : notas) {           
            int qtde = valorInteiro/nota;
            valorInteiro %= nota;
            System.out.println(String.format(Locale.US, "%d nota(s) de R$ %.2f", qtde, (float) nota));
        }
        
        valorQuebrado += valorInteiro;
        System.out.println("MOEDAS:");
        for (float moeda : moedas) {
            int qtde = (int) Math.floor(valorQuebrado/moeda);
            valorQuebrado %= moeda;
            valorQuebrado = arredonda2Casas(valorQuebrado);
            System.out.println(String.format(Locale.US, "%d moeda(s) de R$ %.2f", qtde, moeda));
        }
    }
    
    public static double arredonda2Casas (double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }
}