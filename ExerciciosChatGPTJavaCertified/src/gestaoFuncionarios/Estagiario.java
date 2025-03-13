package gestaoFuncionarios;

public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return 100.00; // Estagiário tem bônus fixo
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cargo: Estagiário");
    }
}
