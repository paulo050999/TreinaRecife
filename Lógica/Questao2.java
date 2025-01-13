import java.util.Scanner;
public class Questao2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String nomeUsuario, senha;

        do{
            System.out.println("Digite o nome do usuário: ");
            nomeUsuario = sc.nextLine();

            System.out.println("Digite a senha: ");
            senha = sc.nextLine();

            if (nomeUsuario.equals(senha)){
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário. Tente novamente.");
            }

        } while (nomeUsuario.equals(senha));
        System.out.println("Usuário e senha cadastrados com sucesso!!! :3");

        sc.close();
    }
    
}
