package atividade28032025;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Voce digitou: "+ numero);

        scanner.close();
    }
}
