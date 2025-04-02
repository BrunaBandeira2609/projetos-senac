package atividade28032025;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Lendo dois números reais 
        System.out.println("Digite o primeiro número real");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número real");
        double num2 = scanner.nextDouble();
         
        //Calculando a média aritmetica 
        double média = ( num1 + num2) / 2;
         
        //Exibindo o resultando 

        System.out.println("Média" + média);
        scanner.close();

    }
    
}
