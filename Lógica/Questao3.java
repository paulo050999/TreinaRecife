import java.util.Scanner;
public class Questao3 {
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
        char sexo = sc.nextLine().toUpperCase().charAt(0);
        char primeiraLetra = sexo.charAt(0);
        if(primeiraLetra=='M'){
            System.out.println("Seu sexo é masculino");
        }else if(primeiraLetra=='F'){
            System.out.println("Seu sexo é femino");
        }
        while (primeiraLetra != 'M' || primeiraLetra != 'F'){
            System.out.println("Digite novamente seu sexo: ");
        }
        System.out.println("Digite seu estado civil");
        String estadoCivil = sc.nextLine().toUpperCase();
        char primeiraLetraEC = estadoCivil.charAt(0);
        if(primeiraLetraEC == 'S'){
            System.out.println("Você é solteiro");
        }else if (primeiraLetraEC == 'C') {
            System.out.println("Você é casado");
        }else if (primeiraLetraEC == 'V'){
            System.out.println("Você é divorciado");
        }else if (primeiraLetraEC == 'D'){
            System.out.println("Você é divorciado");
        }
        
        
        while (primeiraLetraEC != 'S' || primeiraLetra != 'C' || primeiraLetra != 'V' || primeiraLetraEC != 'D'){
            System.out.println("Digite outro estado civil: ");
            sc.close();
        }
    }
}