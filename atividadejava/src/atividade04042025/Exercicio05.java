package atividade04042025;
import java.util.Scanner;
public class Exercicio05 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int número = scanner.nextInt();

        int resultado; 

        if (número >= 0) {
            resultado = número * 2;
        
        } else {
            resultado = número * 3; 
        }
        System.out.println("O resultado é:" + resultado);
        scanner.close();



    }
}
