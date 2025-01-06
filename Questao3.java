/*Questão 3: Soma de Dous Números
 * Faça um prgrama que peça dois números e imprima a soma. */
import java.util.Scanner;
public class Questao3 {

    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número");
        int n1 = scanner.nextInt(); 
        System.out.println("Escreva o segundo número");
        int n2 = scanner.nextInt();
        int soma = n1+n2;
        System.out.println("A soma de" + n1 + "e" + n2 + "é" + soma);
        scanner.close();
    }
}