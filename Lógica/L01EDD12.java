/*Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
        Salário Bruto: (5 * 220)        : R$ 1100,00
        (-) IR (5%)                     : R$   55,00  
        (-) INSS ( 10%)                 : R$  110,00
        FGTS (11%)                      : R$  121,00
        Total de descontos              : R$  165,00
        Salário Liquido                 : R$  935,00 */

import java.util.Scanner;
public class L01EDD12 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu salário bruto: ");
        double valorHora = sc.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mês");
        int horasTrabalhadas = sc.nextInt();
        double salarioBruto = valorHora+horasTrabalhadas;
        double descontoIR = 0;
        if(salarioBruto<=900) {
            descontoIR = 0;
            System.out.println("")
        }else if (salarioBruto <=1500){
            descontoIR = salarioBruto*0.05;
        }else if (salarioBruto <=2500){
            descontoIR = salarioBruto*0.10;
        }else {
            descontoIR = salarioBruto*0.20;
        }
        double descontoSindicato=salarioBruto*0.03;
        double fgts = salarioBruto*0.11;
        double inss = salarioBruto *0.10;
        double totalDescontos = descontoIR + descontoSindicato + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: (" + horasTrabalhadas + "R$" + valorHora + String.format("%2.2f", salarioBruto));
        System.out.println("(-)IR (" + getporcentagem(salarioBruto) + "%) : + R$ " + Stri;
        }




    }
    
}
