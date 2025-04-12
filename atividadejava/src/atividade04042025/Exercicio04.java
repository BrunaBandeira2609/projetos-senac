package atividade04042025;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Digite o valor de A:");
     int A = scanner.nextInt();

     System.out.println("Digite o valor de B:");
     int B = scanner.nextInt();

     int C; 

     if (A == B){ 
        C = A + B;
    
     } else { 
        C = A * B;
     }
     System.out.println("O resultado é: " + C);
     scanner.close();
    }



}
