//
import java.util.Scanner;
public class L01EDD32 {
    public static boolean isPalidrom(String numero){
        int n = numero.length();
        for (int i = 0; i < n / 2;i++){
            if (numero.charAt(i) != numero.charAt(n -1 -1)){
                return false;
            }
            return true;
    
        }
    

public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número de 5 digitos");
    String numero = sc.nextLine();
    if(numero.length() != 5 || numero.matches("\\d+")){
        System.out.println("Erro: Você deve digitar um número exatamente com 5 digitos");
    }else {
        if(isPalidrom(numero)){
            System.out.println("O número" + numero + "é um palindromo.");
        }else{
            System.out.println("O npumero " + numero + "não é um palindromo");
        }
    }
    sc.close();
}
}

}