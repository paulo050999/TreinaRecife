// Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
import java.util.Scanner;
public class L01EDD02 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe um número: ");
        int n1 = sc.nextInt();
        if (n1>0){
            System.out.println("O número é positivo");
        } else if (n1<0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é 0");
        }
        sc.close();

    }
}
