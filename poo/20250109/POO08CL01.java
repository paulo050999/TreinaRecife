/* Classe Bola: Crie uma classe que modele uma bola:

Atributos: Cor, circunferência, material
Métodos: trocaCor e mostraCor */

//assinatura de metodos são nome, modificador de acesso e parametro
import java.util.Scanner;
public class POO08CL01 {
    private String cor, material;
    private double circunferencia;
    private String a ="azul";
    public POO08CL01(String inicialCor){
        this.cor=inicialCor;
        this.circunferencia=2.987;
        this.material="ferro";
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("cor: ");
        POO08CL01 bola = new POO08CL01("branca");
        bola.trocaCor(sc.nextLine());
        sc.close();
        System.out.println(bola.mostraCor());
    }
    public void trocaCor(String novaCor) {
        this.cor = novaCor;
    }

    public String mostraCor(){
        return this.cor;
    }
}
