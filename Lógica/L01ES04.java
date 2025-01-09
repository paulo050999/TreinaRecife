// Faça um Programa que peça as 4 notas bimestrais e mostre a média.
import java.util.Scanner;
public class L01ES04 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota do primeiro bimestre: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a nota do segundo bimestre: ");
        double n2 = sc.nextDouble();
        System.out.println("Digite a nota do terceiro bimestre: ");
        double n3 = sc.nextDouble();
        System.out.println("Digite a nota do quarto bimestre: ");
        double n4 = sc.nextDouble();
        System.out.println("A média anual foi: "+ ((n1+n2+n3+n4)/4));
    }
}
