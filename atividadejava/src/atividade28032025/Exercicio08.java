package atividade28032025;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Lendo os dois números inteiros 
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        //Calculando o produto 
        int produto = num1 * num2;

        //Exibindo o resultado 
        System.out.println("O produto dos números é:" + produto);

        scanner.close();
    }
    
}
