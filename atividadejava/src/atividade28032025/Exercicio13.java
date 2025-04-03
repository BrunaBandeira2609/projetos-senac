package atividade28032025;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro cateto: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o segundo cateto : ");
        double b = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("A hipotenusa do triangulo é: %.2f%n", hipotenusa);

        scanner.close();


    }

    
}
