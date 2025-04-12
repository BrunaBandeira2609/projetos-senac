package atividade04042025;
import java.util.Scanner;
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você é maior de idade? responda SIM ou NÃO:");
        String resposta = scanner.nextLine().trim().toUpperCase();

        boolean maiorDeIdade; 
        
        if (resposta.equals("SIM")){ 
           maiorDeIdade = true;
        } else {
          maiorDeIdade = false;  
        }
        if (maiorDeIdade){ 
            System.out.println("A pessoa é maior de idade.");
        } else { 
            System.out.println("A pessoa é menor de idade");
        }
        scanner.close();

    }
}
