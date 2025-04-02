package atividade28032025;

public class Exercicio02 {
    public static void main(String[] args) {
        
        // imprima a média aritimetica entre 8,2,4 e 5

        int[] numeros = {8,2,4,5};
         int soma = 0; 

         for (int num : numeros){ 
            soma += num;
         }
         double media = (double) soma / numeros.length;
         System.out.println("A média aritmética é " + media);
    }
}
