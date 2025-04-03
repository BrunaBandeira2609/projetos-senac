package atividade28032025;
import java.util.Scanner;
public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int resto = num1 % num2 ;

        System.out.println("O resto da divisão de " + num1 + num2 + " é: " + resto);
        scanner.close(); 
    }
}