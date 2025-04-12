package atividade04042025;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner("System.in");

        System.out.println("Digite um número:");
        int número = input.nextInt();

        if (número % 2 == 0){ 
            System.out.println("O número " + número + " é par.");

        } else {
            System.out.println("O número " + número + "é ímpar.");
         } 
         input.close();
    }
    
}
