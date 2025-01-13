/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos
 (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor sobre o resultado).
  Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%. Escrever um programa que leia o custo de 
  fábrica de um carro e informe o custo ao consumidor do mesmo.
*/
import java.util.Scanner;
public class des1 {
  public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o custo de Fábrica: ");
    double custoFabrica = sc.nextDouble();
    double percentualRevendedor = (28 * custoFabrica) / 100 ;
    double impostos = (45 * custoFabrica) / 100;
    double precoFinal = custoFabrica + percentualRevendedor + impostos;

    System.out.println("O valor final do automovel é : "+ precoFinal);
    sc.close();
  }
}