//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
import java.util.Scanner;
public class L01ES08 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora? ");
        double ganhoPorHora = sc.nextDouble();
        System.out.println("Quantas horas você trabalha por mês? ");
        double horaTrabalhada = sc.nextDouble();
        System.out.println("nesse mês você ganhor: " + (ganhoPorHora*horaTrabalhada));

    }
}
