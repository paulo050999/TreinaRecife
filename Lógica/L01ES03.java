//Faça um Programa que peça dois números e imprima a soma.
import java.util.Scanner;
public class L01ES03 {
    public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int n1 = sc.nextInt();
    System.out.println("Digite outro número: ");
    int n2 = sc.nextInt();
    System.out.println("Os números digitados foram: " + n1 + " e " + n2);

    }
}
