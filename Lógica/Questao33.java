import java.util.Scanner;
public class Questao33 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        while (nome.length()<3){
            System.out.println("Digite novamente: ");
            nome = sc.nextLine();
        }
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        while (idade<0 || idade> 150){
            System.out.println("Digite sua idade novamente: ");
        }
        System.out.println("Digite seu salário");
        double salario = sc.nextDouble();
        while (salario<0){
            System.out.println("Digite novamente seu salário: ");
        }
        System.out.println("Digite o seu sexo: ");
        String sexo = sc.nextLine().toUpperCase();
        char primeiraLetra = sexo.charAt(0);
        while (primeiraLetra != 'M' || primeiraLetra != 'F'){
            System.out.println("Digite novamente seu sexo: ");
        }
        System.out.println("Digite seu estado civil");
        String estadoCivil = sc.nextLine().toUpperCase();
        char primeiraLetra = sexo.charAt(0);

    }
    
}
