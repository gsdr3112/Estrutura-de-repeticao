package br.com.dio.exercicios;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        loopDoWhile();

        loopFor();

    }

    public static void loopDoWhile() {
        Scanner scan = new Scanner(System.in);
        int numTabuada;

        System.out.println("Informe o número que deseja exibir a tabuada: ");
        numTabuada = scan.nextInt();
        int cont = 1;

        System.out.println("Tabuada do " + numTabuada + ":");
        do {
            System.out.println(numTabuada + " X " + cont + " = " + numTabuada * cont);
            cont++;
        } while (cont < 11);

    }

    public static void loopFor() {
        Scanner scan = new Scanner(System.in);
        int numTabuada;

        System.out.println("Informe o número que deseja exibir a tabuada: ");
        numTabuada = scan.nextInt();
        int cont = 1;

        System.out.println("Tabuada do " + numTabuada + ":");

        for (int i = 1; i < 11; i++) {
            System.out.println(numTabuada + " X " + i + " = " + numTabuada * i);
        }

    }
}