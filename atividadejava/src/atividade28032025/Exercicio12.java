package atividade28032025;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Solicita as bases e a altura ao usuário
        System.out.println("Digite a base maior do trapézio: ");
        double baseMaior = scanner.nextDouble();

        System.out.println("Digite a base menor do trapézio: ");
        double basemenor = scanner.nextDouble();

        System.out.println("Digite a altura do trapézio: ");
        double altura = scanner.nextDouble();

        // Calcula a aréa 
        double área = (baseMaior + basemenor)* altura /2;

        //Exibe o resultado 
        System.out.println("A área do trapézio é: " + área);

        scanner.close();

    }
    
}
