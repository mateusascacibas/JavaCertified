package sistemaLogin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sucesso = false;

        // Criando usuário (com validação)
        Usuario usuario = criarUsuario(scanner);

        // Tentativas de login
        int tentativas = 0;
        while (!sucesso && tentativas < 3) {
            System.out.println("\nTentativa " + (tentativas + 1) + " de 3");
            System.out.print("Usuário: ");
            String nomeUsuario = scanner.next();
            System.out.print("Senha: ");
            String senhaUsuario = scanner.next();

            // Verifica credenciais (case-sensitive para senha)
            if (nomeUsuario.equals(usuario.getNome()) && senhaUsuario.equals(usuario.getSenha())) {
                sucesso = true;
                System.out.println("\n✅ Login realizado com sucesso!");
            } else {
                System.out.println("❌ Usuário ou senha incorretos.");
            }

            tentativas++;
        }

        // Se falhar 3 vezes, bloqueia o usuário
        if (!sucesso) {
            System.out.println("\n❌ Conta bloqueada após 3 tentativas!");
        }

        scanner.close();
    }

    private static Usuario criarUsuario(Scanner scanner) {
        String nome, senha;

        // Validação de nome e senha
        do {
            System.out.print("Digite seu nome (mínimo 3 caracteres): ");
            nome = scanner.next();
        } while (nome.length() < 3);

        do {
            System.out.print("Digite sua senha (mínimo 3 caracteres): ");
            senha = scanner.next();
        } while (senha.length() < 3);

        System.out.println("\n✅ Conta criada com sucesso!\n");
        return new Usuario(nome, senha);
    }
}
