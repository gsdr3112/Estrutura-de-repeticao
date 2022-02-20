package br.com.dio.exercicios;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        metodo1();
    }

    public static void metodo1() {
            Scanner scan = new Scanner(System.in);
            int nota;

            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scan.nextInt();

            while (nota>10 || nota<0){
                System.out.println("Valor inválido!");
                System.out.println("Digite uma nota entre 0 e 10: ");
                nota = scan.nextInt();
            }

    }
}
