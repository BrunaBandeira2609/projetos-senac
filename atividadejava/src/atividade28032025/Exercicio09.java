package atividade28032025;
import java.util.Scanner;

public class Exercicio09 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Lendo um número real 
        System.out.println("Digite um número real: ");
        double num = scanner.nextDouble();

        //Calculando a terça parte 
        double terço = num / 3;

        //Exibindo o resultado 
        System.out.println("A terça parte do número é:" + terço);
    }
}
