package atividade28032025;
import java.util.Scanner; 

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
       //Solicita a base e a altura ao usuário
       System.out.println("Digite a base do triângulo: ");
       double base = scanner.nextDouble();

       System.out.println("Digite a altura do triângulo: ");
       double altura = scanner.nextDouble();

       //Calcula a área 
       double área = (base * altura) / 2;
       
       //Exibe o resultado 
       System.out.println("A área do triangulo é" + área);
       scanner.close();

    }
}


