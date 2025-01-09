// Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
import java.util.Scanner;

public class L01ES02{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int n1 = sc.nextInt();
        System.out.println("O número digitado foi: "+ n1);
    }
}

