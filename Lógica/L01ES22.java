//
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class L01ES22 {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho da área a ser pintada (em m2)");
        double area = scanner.nextDouble();
        double areaComFolga = area*1.1;

        double litrosNecessarios = areaComFolga/6;

        int capacidadeLata = 18;
        double precoLata = 80.0;
        int capacidadeGalao = 3;
        double precoGalao = 25.0;


        int galoesNecessarios = (int) Math.ceil(litrosNecessarios/capacidadeGalao);
        int latasNecessarias = (int) Math.ceil(litrosNecessarios / capacidadeLata);
        double custoGaloes = galoesNecessarios * precoGalao;
        double restoLitros = litrosNecessarios % capacidadeLata;
        int latasParaMistura = (int) (litrosNecessarios /capacidadeLata);
        int galoesParaMistura = (int) Math.ceil(restoLitros/capacidadeGalao);
        double custoMistura = (latasParaMistura * precoLata) * (galoesParaMistura * precoGalao);
        scanner.close();
        System.out.printf("Apenas latas de 18 litros: \n- Quantidade: %d \n Custo: R% %.2f%n", precoLata);
        System.out.printf("Apenas galões de 3,6 litros:\n - Quantidade: %d\n - Custo r$.2f%n", galoesNecessarios, custoGaloes);
        System.out.printf("Mistura de latas e galões: \n- latas: %f\n- Custo: R$ %.2f%n", latasParaMistura, galoesParaMistura, custoMistura);

        
    }
}
