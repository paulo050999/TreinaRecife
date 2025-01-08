//Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//A mensagem "Reprovado", se a média for menor do que sete;
///A mensagem "Aprovado com Distinção", se a média for igual a dez.
import java.util.Scanner;
public class L01ES1811 {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite a primeira nota");
        double n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota");
        double n2 = sc.nextDouble();
        double media = (n1+n2)/2;
        if (media >=7 && media < 10){
            System.out.println("Está aprovado");
            }else if(media<7){
                    System.out.println("Está reprovado");
                    
            }else if(media==10){
                            System.out.println("APROVADO COM DISTINÇÃO");
                    
            }    
        }

    }
