// Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
import java.util.Scanner;
public class L01EDD03 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu sexo: ");
        String entrada = sc.nextLine().toUpperCase();
        char primeiraLetra = entrada.charAt(0);
        if(primeiraLetra == 'M'){
            System.out.println("Sexo masculino");
        } else if(primeiraLetra == 'F'){
            System.out.println("Sexo feminino");
        }else{
            System.out.println("Sexo inválido");
        }
        sc.close();
    }
}
