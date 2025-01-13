// Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
import java.util.Scanner;
public class L01ES10 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = ((celsius * 1.8) + 32);
        System.out.println("A temperatura em farenheit é: " + fahrenheit);
        sc.close();
    }
}
