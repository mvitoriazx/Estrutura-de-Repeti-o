package EstruturadeRepetição;

public class Exercicio10 {
    public static void main(String[] args) {
        int opcao = 1;

        do {
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Sair");

            // Simula a escolha da opção 3
            opcao = 3;

        } while (opcao != 3);

        System.out.println("Sistema encerrado");
    }
}
