package gestaoFuncionarios;

public class Temporario extends Funcionario {
    private int mesesContrato;

    public Temporario(String nome, double salario, int mesesContrato) {
        super(nome, salario);
        this.mesesContrato = mesesContrato;
    }

    @Override
    public double calcularBonus() {
        return salario * 0.05; // Bônus menor para funcionários temporários
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Contrato: " + mesesContrato + " meses");
    }
}
