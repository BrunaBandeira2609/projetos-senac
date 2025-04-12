package atividade04042025;
import java.util.Scanner;
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int número = scanner.nextInt();
        int resultado;

        if (número % 2 ==0) {
            resultado = número + 5;
            
        } else {
            resultado = número + 8;

        }
        System.out.println("O resultado é: " + resultado);
        scanner.close();
    

    }
}
