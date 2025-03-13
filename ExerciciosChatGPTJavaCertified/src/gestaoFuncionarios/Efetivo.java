package gestaoFuncionarios;

public class Efetivo extends Funcionario {
    private final double bonus = 0.10; // Constante (final)

    public Efetivo(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * bonus;
    }
}
