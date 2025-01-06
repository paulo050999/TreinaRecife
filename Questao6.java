/*Questão 6: Área de um Círculo 
 * Faça um programa que peça o raio de um círculo, calcule e imprima sua área. A área de um círculo é dada por Ac = 2*pi  * (R*R) onde R é o raio do círculo
 */

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio do círculo");
        double raio = scanner.nextDouble();
        double area = 2*3.14 * (raio*raio);
        System.out.println("O área do local é  " + area);
        scanner.close();
    }
    
}
