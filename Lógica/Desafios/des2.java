/* Faça um programa que receba a soma de todas as verbas recebidas por um  funcionário no mês(salario, horas-extras e
 comissões) em uma variável do tipo real denominada Salário Bruto. Após o recebimento calcule e exiba na tela o valor 
 do imposto de renda, o valor do INSS e o salário líquido que é obtido abatendo-se do Salário Bruto da soma dos descontos.

Valor Imposto de renda: 5% sobre o salário Bruto
Valor INSS: 11% sobre o salário Bruto */
import java.util.Scanner;
public class des2 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu salário: ");
        double salario = sc.nextDouble();
        System.out.println("Informe seu total de horas extras: ");
        double horasExtras = sc.nextDouble();
        System.out.println("Informe o seu total de comissões: ");
        double comissoes = sc.nextDouble();
        double salarioBruto = (salario + horasExtras + comissoes);
        System.out.println(salarioBruto);
        double impostoRenda = salarioBruto-(salarioBruto*0.05);
        double INSS = salarioBruto-(salarioBruto*0.11);
        double salarioLiquido = salarioBruto-(salarioBruto*0.16);
        System.out.println("seu salário com o desconto do imposto de renda é: " + impostoRenda);
        System.out.println("Seu salário com o desconto do Inss é: " + INSS);
        System.out.println("Seu salário líquido é: " + salarioLiquido);
        sc.close();

    }
}
