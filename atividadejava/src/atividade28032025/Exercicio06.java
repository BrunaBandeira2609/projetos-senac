package atividade28032025;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //solicita e lê um número inteiro 
        System.out.println("Digite um número inteiro: ");
        int número = scanner.nextInt();

        //Fechar scanner 
        scanner.close();

        //Calcula o sucessor e o antecessor
        int antecessor = número - 1;
        int sucessor = número + 1;

        //Imprime os resultados 
        System.out.println("Número digitado:" + número);
        System.out.println("Antecessor:"+ antecessor);
        System.out.println("Sucessor:" + sucessor);

    }
    
}
