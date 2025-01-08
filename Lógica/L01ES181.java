// Faça um programa que verifique se uma letra digitada é vogal ou consoante
import java.util.Scanner;
public class L01ES181 {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite uma letra");
        char letra = sc.next().toUpperCase().charAt(0);

        if(Character.isLetter(letra)){
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("A letra digitada é uma vogal");
        }
            else{ System.out.println("A letra é uma consoante");
        }
    }
            else{
     System.out.println("Não é letra");

            }
        }
    }


