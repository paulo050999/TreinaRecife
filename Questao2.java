/*Questão 2 Número informado
 * Faça um programa que peça um número e então mostre a mensagem:
 * O número informado foi [número].
 */

import java.util.Scanner;
public class Questao2 {
    public static void main (String[]args) {
    Scanner scanner = new Scanner(System.in);
    int numero = scanner.nextInt();
    System.out.println("O número digitado foi" + numero);
    scanner.close();
    }
}
