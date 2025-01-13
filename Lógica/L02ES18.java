/*Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.
 * 
 */

import java.util.Scanner;
public class L02ES18 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite uma data no formato dd//mm//aaaa: ");
    String data=sc.nextLine();

    String [] partes = data.split("/");
    if(partes.length != 3) {
        System.out.println("Formato inválido. Use o formato dd//mm/aaaa.");
        sc.close();
    }
    try{
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        if (dataValida(dia,mes,ano)){
            System.out.println("A data informada é válida.");

        }else{
            System.out.println("A data informada é inválida");
        }

        public static boolean dataValida(int dia, int mes, int ano) {
            if(mes< 1 || mes > 12){
                return false;
            }
            int[] diaPorMes={31,28,31,30,31,31,30,31,30,31}

            if(mes==2 && anoBissexto(ano)) {
                diaPorMes [1] = 29;
            }
            return dia > 0 && dia <= diaPorMes[mes -1];

            public static boolean anoBissexto(int ano){
                return (ano % 4 == 0 && ano % 100 !=0) || (ano % 400 == 0);
            }
         }
        }
    }
