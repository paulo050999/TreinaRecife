import java.util.Scanner;

public class L01EDD01 {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.println("Informe segundo número: ");
        double n2 = scanner.nextDouble();
        if (n1>n2){
            System.out.printf("O maior número digitado foi", n1);
        }else if (n2>n1){
                    System.out.printf("O maior número digitado foi", n2);
                }else{
                    System.out.println("Os números são iguais");
                }
                scanner.close();
        }
    }
