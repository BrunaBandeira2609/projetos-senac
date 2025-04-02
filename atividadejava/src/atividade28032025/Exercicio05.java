package atividade28032025;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //solicita e ler o primeiro numero inteiro 
        System.out.println("Digite o primeiro numero inteiro:");
        int numero01 = scanner.nextInt();

        //solicita o segundo numero inteiro
        System.out.println("Digite o segundo número inteiro: ");
        int numero02 = scanner.nextInt();
               
        //fechar scanner 
        scanner.close();

        //imprime os números lidos 
        System.out.println("Você digitou os números:"+ numero01 + "e" + numero02);



    }
}
