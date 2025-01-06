/* Questão 4: Média de Notas Bimestrais
 * Faça um programa que peça as 4 notas bimestrais de um aluno e imprima a média.
 */

import java.util.Scanner;

public class Questao4 {
   public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a primeira nota");
        double n1 = scanner.nextInt(); 
        System.out.println("Escreva a segunda nota");
        double n2 = scanner.nextInt();
        System.out.println("Escreva a terceira nota");
        double n3 = scanner.nextInt();
        System.out.println("Escreva a quarta nota");
        double n4 = scanner.nextInt();
        double media = (n1+n2+n3+n4)/4;
        System.out.println("A média do aluno é: " + media);
        scanner.close();

   } 
}
