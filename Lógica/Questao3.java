import java.util.Scanner;

public class Questao3 {
    
    public static boolean validaNome(String nome) {
        if (nome.length() > 3) {
            return true;
        } else {
            System.out.println("Nome deve ter mais de 3 caracteres.");
            return false;
        }
    }

    public static boolean validaIdade(int idade) {
        if (idade >= 0 && idade <= 150) {
            return true;
        } else {
            System.out.println("Idade deve estar entre 0 e 150 anos.");
            return false;
        }
    }

    public static boolean validaSalario(double salario) {
        if (salario > 0) {
            return true;
        } else {
            System.out.println("Salário deve ser maior que zero.");
            return false;
        }
    }

    public static boolean validaSexo(char sexo) {
        if (sexo == 'f' || sexo == 'm') {
            return true;
        } else {
            System.out.println("Sexo deve ser 'f' ou 'm'.");
            return false;
        }
    }

    public static boolean validaEstadoCivil(char estadoCivil) {
        if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd') {
            return true;
        } else {
            System.out.println("Estado civil deve ser 's' (solteiro), 'c' (casado), 'v' (viúvo), 'd' (divorciado).");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        while (!validaNome(nome)) {
            System.out.print("Digite seu nome (deve ter mais de 3 caracteres): ");
            nome = scanner.nextLine();
        }

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        while (!validaIdade(idade)) {
            System.out.print("Digite sua idade (deve estar entre 0 e 150): ");
            idade = scanner.nextInt();
        }

        System.out.print("Digite seu salário: ");
        double salario = scanner.nextDouble();
        while (!validaSalario(salario)) {
            System.out.print("Digite seu salário (deve ser maior que zero): ");
            salario = scanner.nextDouble();
        }

        System.out.print("Digite seu sexo (f para feminino ou m para masculino): ");
        char sexo = scanner.next().charAt(0);
        while (!validaSexo(sexo)) {
            System.out.print("Digite seu sexo (f para feminino ou m para masculino): ");
            sexo = scanner.next().charAt(0);
        }

        System.out.print("Digite seu estado civil (s para solteiro, c para casado, v para viúvo, d para divorciado): ");
        char estadoCivil = scanner.next().charAt(0);
        while (!validaEstadoCivil(estadoCivil)) {
            System.out.print("Digite seu estado civil (s para solteiro, c para casado, v para viúvo, d para divorciado): ");
            estadoCivil = scanner.next().charAt(0);
        }
        System.out.println("\nInformações válidas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + String.format("%.2f", salario));
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();
    }
}