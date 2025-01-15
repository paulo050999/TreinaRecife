
/* Altere o programa anterior permitindo ao usuário informar as populações e as taxas
de crescimento iniciais. Valide a entrada e permita repetir a operação.
 */
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double populacaoA, populacaoB, crescimentoA, crescimentoB;
        int count = 0;
        do { System.out.println("Informe a a populacão do país A: ");
        populacaoA = sc.nextDouble();
        while (populacaoA < 0) {
            System.out.println("Digite um número de população positivo");
            populacaoA = sc.nextDouble();
        }
        System.out.println("Informe a população do país B: ");
        populacaoB = sc.nextDouble();
        while (populacaoB < 0) {
            System.out.println("Digite um número de população positivo");
            populacaoB = sc.nextDouble();
        }
        if (populacaoA>populacaoB){
            System.out.println("O país A já é maior que a população de B");
        }
            
        } while (populacaoA>populacaoB);
        do {
           
            System.out.println("Informe a taxa de crescimento pupulacional do país A");
            crescimentoA = sc.nextDouble();
            System.out.println("Informe a taxa de crescimento pupulacional do país B");
            crescimentoB = sc.nextDouble();
            
            if (crescimentoA<=crescimentoB){
                System.out.println("O país A nunca alcançarpa o país B em população");
            }

        } while (crescimentoA<=crescimentoB);

        while (populacaoA <= populacaoB) {
            populacaoA += populacaoA * (crescimentoA / 100);
            populacaoB += populacaoB * (crescimentoB / 100);

            count++;
        }
        System.out.println("São necessários " + count + " anos para o país A passar o país B em população");
        sc.close();
    }
}
