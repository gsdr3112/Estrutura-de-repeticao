package br.com.dio.exercicios;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;
        int quantidadePares = 0;
        int quantidadeImpares = 0;


        System.out.println("Informe a quantidade de números: ");
        size = scan.nextInt();
        int[] array = new int[size];
        int count = 0;

        do {
            System.out.println("Digite um número: ");
            array[count] = scan.nextInt();
            if ((array[count] % 2) == 0) quantidadePares++;
            else quantidadeImpares++;
            count++;
        } while (count < size);

        System.out.println("Quantidade de pares: " + quantidadePares);
        System.out.println("Quantidade de ímpares: " + quantidadeImpares);


    }
}
