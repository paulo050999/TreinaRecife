import java.util.Scanner;
public class L01ES23 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo para download (em MB): ");
        double tamanhoArquivo = scanner.nextDouble();

        System.out.println("Informe a velocidade do Link (em Mbps): ");
        double velocidadeLink = scanner.nextDouble();

        double velocidadeMbps = velocidadeLink * 0.125;

        double tempoSegundos = tamanhoArquivo /velocidadeMbps;

        double tempoMinutos = tempoSegundos / 60;

        scanner.close();

        System.out.printf("O tempo aproximado de download será: %.2f minutos.%n", tempoMinutos);
    }
}
