import java.util.Scanner;

public class Questao1 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    double nota;

    do{
        System.out.println("Digite uma nota entre 0 e 10: ");
        nota = sc.nextDouble();

        if(nota < 0 || nota > 10){
            System.out.println("Nota inválida! Por favor insira um valor entre 0 e 10");
        }
    }while(nota < 0 || nota > 10);
    System.out.println("Nota válida "+ nota);
    sc.close();
    
}
