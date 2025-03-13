package gestaoFuncionarios;

public enum NivelCargo {
    JUNIOR("Júnior"),
    PLENO("Pleno"),
    SENIOR("Sênior");

    private String descricao;

    NivelCargo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
