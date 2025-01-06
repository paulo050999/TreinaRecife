/*Questão 7: Área de um quadrado 
 * Faça um programa que calcule a área de um quadrado, em seguida imprima o dobro desta área para o usuário.
 * Á área de um quadrado é dada por Aq = L*L, onde l, é o comprimento do lado do quadrado.
*/

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o comprimento do lado do quadrado");
        double l = scanner.nextDouble();
        double area = l*l;
        System.out.println("O área do quadrado é  " + area*2);
        scanner.close();
}
}