//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
//C = 5 * ((F-32) / 9).
import java.util.Scanner;
public class L01ES09 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Me diga a temperatura em Fahrenheit: ");
        double temp = sc.nextDouble();
        double C=0;
        System.out.println("A temperatura informada transformada em graus Celsius é: " + (C = 5 * ((temp-32) / 9)));
    }
}
