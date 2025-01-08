import java.util.Scanner;

public class L01ES25 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        double n1 = scanner.nextDouble();
        scanner.close();
        if (n1>0){
            System.out.println("O número" + n1 + "É positivo");
        } else { System.out.println("O número" + n1 + "É negativo");
        }
    }
}
