/* As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.
 * 
 */
import java.util.Scanner;
public class L01ES11 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu salário: ");
        double salario = sc.nextDouble();
        if (salario <= 280){
            System.out.println("Seu salário antes do aumento é: " + salario);
            System.out.println("O percentual de aumento foi de 20%");
            System.out.println("O valor do aumento foi: " + ((salario * 1.2)-salario));
            System.out.println("O seu salário com o aumento é: " + (salario * 1.2));
        }else if (salario > 280 && salario < 659){
            System.out.println("Seu salário antes do aumento é: " + salario);
            System.out.println("O percentual de aumento foi de 15%");
            System.out.println("O valor do aumento foi: " + ((salario * 1.15)-salario));
            System.out.println("O seu salário com o aumento é: " + (salario * 1.15));
        }else if (salario > 700 && salario < 1500){
            System.out.println("Seu salário antes do aumento é: " + salario);
            System.out.println("O percentual de aumento foi de 10%");
            System.out.println("O valor do aumento foi: " + ((salario * 1.1)-salario));
            System.out.println("O seu salário com o aumento é: " + (salario * 1.1));
        }else if (salario >= 1500){
            System.out.println("Seu salário antes do aumento é: " + salario);
            System.out.println("O percentual de aumento foi de 5%");
            System.out.println("O valor do aumento foi: " + ((salario * 1.05)-salario));
            System.out.println("O seu salário com o aumento é " + (salario * 1.05));
        }

sc.close();
    }

    }


