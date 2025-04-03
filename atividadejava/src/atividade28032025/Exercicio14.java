package atividade28032025;
import java.util.Scanner;

public class Exercicio14 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    System.out.println("Digite a altura da lata (cm): ");
    double raio = scanner.nextDouble();

    System.out.println("Digite a altura da lata (cm): ");
    double altura = scanner.nextDouble();

    double volume = Math.PI * Math.pow(raio,2) * altura;

    System.out.printf("O volume da lata de óleo é: %.2f cm3%n", volume);
    scanner.close();
    
    }
}
