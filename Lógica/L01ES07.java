// Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
import java.util.Scanner;
public class L01ES07 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a medida de um dos lados do quadrado: ");
        double L = sc.nextDouble();
        System.out.println("O dobro da área deste quadrado é: " + (L*L)*2);

    }
}
