/* Construa um algoritmo para determinar se o indivíduo está com um peso favorável ou não. Essa situação é determinada
 através do IMC ( Índice de Massa Corpórea), que é definida como sendo a relação entre o peso (PESO) e o quadrado da 
 Altura (ALTURA) do indivíduo. */
 import java.util.Scanner;
public class des3 {
    /**
     */
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Informe sua altura por favor: ");
        double altura = sc.nextDouble();
        System.out.println("Informe Seu peso");
        double peso = sc.nextDouble();
        double imc = (peso / (altura*altura));
        if (imc <20) {
            System.out.println("abaixo do peso");
        }else if(imc>20 && imc <25){System.out.println("Peso ideal");
    }else if(imc>25 && imc <30){System.out.println("Sobrepeso");
}else if(imc>30 && imc<40){System.out.println("Obesidade");
}else{
    System.out.println("Obesidade morbida");

}
sc.close();
        }


    }
    
