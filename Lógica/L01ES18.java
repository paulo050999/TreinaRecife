import java.util.Scanner;
public class L01ES18 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o sexo: M para masculino, F para feminino");
        char sexo = sc.next().toUpperCase().charAt(0);
        System.out.println("Digite a altura (em metros)");
        double altura = sc.nextDouble();
        double pesoIdeal;
        if(sexo=='M'){
            pesoIdeal = (71.7 * altura) -58;
            System.out.printf("Seu peso ideal é %.2f kg", pesoIdeal);
        }else if (sexo == 'F'){
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é % 2f kg", pesoIdeal);
        }else{
            System.out.println("Sexo Inválido, pense com calma antes de responder");
            sc.close();
        }

    }

}
