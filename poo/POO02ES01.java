//Faça um Programa que peça dois números e imprima o maior deles.

import java.util.Scanner;
public class POO02ES01 {
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um novo numéro");
        double n1 = scan.nextDouble();
        System.out.println("Digite o segundo número");
        double n2 = scan.nextDouble();

        if (n1 > n2) {
            System.out.println("O primeiro número é maior que o segundo");
        }else {
                System.out.println("O número 1 é menor");

        }



    }
    
}
