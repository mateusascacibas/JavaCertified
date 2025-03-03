package sistemaControlePontos;

import java.util.Scanner;

public class Main {
    private static boolean sair = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando jogador
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        System.out.print("Digite seus pontos iniciais: ");
        int pontosIniciais = scanner.nextInt();
        Jogador jogador = new Jogador(nome, pontosIniciais);

        System.out.println("Olá, " + jogador.getNome() + "! Você tem " + jogador.getPontos() + " pontos e está classificado como " + jogador.getClassificacao());

        while (!sair) {
            exibirMenu();
            int opcao = scanner.nextInt();
            processarOpcao(opcao, jogador, scanner);
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Adicionar pontos");
        System.out.println("2 - Remover pontos");
        System.out.println("3 - Exibir informações");
        System.out.println("4 - Sair");
        System.out.print("Escolha: ");
    }

    private static void processarOpcao(int opcao, Jogador jogador, Scanner scanner) {
        switch (opcao) {
            case 1:
                System.out.print("Quantos pontos deseja adicionar? ");
                int pontosAdd = scanner.nextInt();
                jogador.adicionarPontos(pontosAdd);
                break;
            case 2:
                System.out.print("Quantos pontos deseja remover? ");
                int pontosRemover = scanner.nextInt();
                jogador.removerPontos(pontosRemover);
                break;
            case 3:
                System.out.println(jogador.exibirInformacoes());
                break;
            case 4:
                sair = true;
                System.out.println("Obrigado por jogar, " + jogador.getNome() + "! Até mais.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
}
