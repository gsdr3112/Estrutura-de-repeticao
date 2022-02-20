package br.com.dio.exercicios;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numeroArray = new double[5];
        double maiorNumero = 0;
        int count = 0;
        double media = 0;

        do {
            System.out.println("Digite um número maior que 0: ");
            numeroArray[count] = Double.parseDouble(scan.nextLine());
            if (numeroArray[count] > maiorNumero) maiorNumero = numeroArray[count];
            media = media + numeroArray[count];
            count++;
        } while (count < 5);

        media = media / (count);

        System.out.println("Média: " + media);
        System.out.println("Maior número: " + maiorNumero);



    }
}
