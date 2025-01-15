/*Supondo que a população de um país A seja da ordem de 80000 habitantes com
uma taxa anual de crescimento de 3% e que a população de B seja 200000
habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e
escreva o número de anos necessários para que a população do país A ultrapasse
ou iguale a população do país B, mantidas as taxas de crescimento. */
public class Questao4 {
    public static void main (String []args){
        double populacaoPaisA = 80000;
        double populacaoPaisB = 200000;
        int count =0;
        while
            (populacaoPaisA <= populacaoPaisB){
                    populacaoPaisA = populacaoPaisA * 1.03; 
                    populacaoPaisB = populacaoPaisB * 1.015;

                    count++; 
        }
        System.out.println("São necessários " + count + " anos para o país A passar o país B em população");
    }    
}
