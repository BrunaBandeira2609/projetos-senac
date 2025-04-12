package atividade04042025;
import java.util.Scanner;
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leitura dos valores 
        System.out.println("Digite o valor de A:");
        int A = scanner.nextInt();
        
        System.out.println("Digite o valor de B:");
        int B = scanner.nextInt();
         
        System.out.println("Digite o valor de C:");
        int C = scanner.nextInt();

        if (A + B < C){ 
            System.out.println("A soma de A e B é menor que C.");
    } else { System.out.println("A soma de A e B NÃO é menor que C");
    scanner.close();
    }
        }
    }
