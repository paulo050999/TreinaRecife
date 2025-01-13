/*Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá pedir
os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os 
demais valores, sendo encerrado;
Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário; */
import java.util.Scanner;
public class L02ES16 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (a==0){
            System.out.println("O valor de 'a' é zero. A equação não é do segundo grau.");
            sc.close();
            System.exit(0);
            return;
        }
        System.out.println("Digite o valor de b: ");
        double b = sc.nextDouble();
        System.out.println("Digite o valor de c: ");
        double c = sc.nextDouble();
        double delta = Math.pow(b, 2) - (4*2*c);
        if (delta<0){
            System.out.println("O delta é negativo. A equação não possui raízes reais.");
            System.exit(0);
        }else if (delta==0) {
            double raizUnica = -b /(2*a);
            System.out.printf("O delta é zero. A equação possui uma única raiz real: %2.f%n,raizUnica");


        }else{
            double raiz1 = (-b + Math.sqrt(delta)) / (2*a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.printf("O delta é positivo. A equação possui duas raízes reais:%n");
            System.out.printf("Raiz 1: %2fn", raiz1);
            System.out.printf("Raiz 2: %2fn", raiz2);
            sc.close();
        }
            
        }


    }
