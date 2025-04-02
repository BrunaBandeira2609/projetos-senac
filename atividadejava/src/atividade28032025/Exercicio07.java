package atividade28032025;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);

        //Solicita e lê o primeiro número inteiro 
        System.out.println("Digite o primeiro número inteiro: ");
        int número01 = scanner.nextInt();

        //Solicita e lê o segundo número inteiro
        System.out.println("Digite o segundo número inteiro");
        int número02 = scanner.nextInt();

        scanner.close();

        //Calcula a soma 
        int soma = número01 + número02;

        //Imprime o resultado com a mensagem "SOMA"
        System.out.println("Soma\n" + soma);

    }
    
}
