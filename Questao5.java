/*Questão 5: Conversão de Unidades (Comprimento)
 * Faça um programa que converta metros para centímetros (1m = 100cm).
 */
import java.util.Scanner;
public class Questao5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma metragem");
        double numero = scanner.nextDouble();
        double conversao = numero * 100;
        System.out.println("O número digitado foi  " + conversao);
        scanner.close();
    }
    
}
