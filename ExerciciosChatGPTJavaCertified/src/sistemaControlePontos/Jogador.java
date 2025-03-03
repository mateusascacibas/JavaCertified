package sistemaControlePontos;

public class Jogador {
    private String nome;
    private int pontos;

    public Jogador(String nome, int pontosIniciais) {
        this.nome = nome;
        this.pontos = Math.max(pontosIniciais, 0); // Garante que não inicie com valor negativo
    }

    public void adicionarPontos(int valor) {
        if (valor > 0) {
            this.pontos += valor;
            System.out.println("Agora você tem " + this.pontos + " pontos e sua classificação mudou para " + getClassificacao());
        } else {
            System.out.println("Erro: O valor deve ser maior que zero.");
        }
    }

    public void removerPontos(int valor) {
        if (valor > 0 && this.pontos >= valor) {
            this.pontos -= valor;
            System.out.println("Agora você tem " + this.pontos + " pontos e sua classificação mudou para " + getClassificacao());
        } else {
            System.out.println("Erro: Você não pode ter menos de 0 pontos. Tente novamente.");
        }
    }

    public String exibirInformacoes() {
        return "Nome: " + this.nome + " - Pontos: " + this.pontos + " - Classificação: " + getClassificacao();
    }

    public String getClassificacao() {
        return Classificacao.getClassificacao(this.pontos);
    }

    public int getPontos() {
        return this.pontos;
    }

    public String getNome() {
        return this.nome;
    }
}
