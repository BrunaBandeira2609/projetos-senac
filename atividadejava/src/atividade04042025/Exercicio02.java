package atividade04042025;
import java.util.Scanner;
public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        String nome = input.nextLine();

        System.out.println("Digite o sexo (M/F): ");
        String sexo = input.nextLine().toUpperCase();

        System.out.println("Digite o estado civil: ");
        String estadoCivil = input.nextLine().toUpperCase();

        int tempocasada = 0;
         
        if (sexo.equals("F")&& estadoCivil.equals("CASADA")){
            System.out.println("Digite o tempo de casada (em anos):");
            tempocasada = input.nextInt();
 }  
 System.out.println("\n--- Dados da Pessoa ---");
 System.out.println("Nome:"+ nome);
 System.out.println("Sexo:"+ sexo);
 System.out.println("Estado Civil:" + estadoCivil);
 if (sexo.equals("F")&& estadoCivil.equals("CASADA"));{ 
    System.out.println("Tempo de Casada:" + tempocasada +"anos");
 }
 input.close();
    }
    
}
