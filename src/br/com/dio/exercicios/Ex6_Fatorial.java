package br.com.dio.exercicios;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long numero;

        System.out.println("Digite um número para exibir seu fatorial: ");
        numero = scan.nextLong();
        long fatorial = numero;

        for (long i = numero - 1; i > 0; i--) {
            fatorial = fatorial * i;
        }
        System.out.println(numero + "! = " + fatorial);
    }
}
