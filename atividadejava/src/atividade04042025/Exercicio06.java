package atividade04042025;
import java.util.Scanner;
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você é maior de idade? responda SIM ou NÃO:");
        String resposta1 = scanner.nextLine().trim().toUpperCase();
        boolean maiorDeIdade = resposta1.equals("SIM");

        System.out.println("Você possui RG? responda SIM ou NÃO:");
        String resposta2 = scanner.nextLine().trim().toUpperCase();
        boolean possuiRG = resposta2.equals("SIM");

        System.out.println(maiorDeIdade? "A pessoa é maior de idade." : "A pessoa é menor de idade");
        System.out.println(possuiRG? "A pessoa possui RG." : "A pessoa não possui RG");

        if (maiorDeIdade == possuiRG) {
            if (maiorDeIdade) {
                System.out.println("Ambas as respostas sào VERDADEIRAS");
            } else {
                System.out.println("Ambas as respostas são FALSAS.");
            } else {
                System.out.println("As respostas são diferentes(Uma é verdadeira e a outra é falsa)");
            }
            scanner.close();
        }
    

}
