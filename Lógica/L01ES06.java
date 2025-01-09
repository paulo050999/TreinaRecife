// Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
import java.util.Scanner;
public class L01ES06 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        double raio = sc.nextDouble();
        System.out.println("a área deste círculo é: " + (3.14 * (raio*raio)));
    }
    
}
