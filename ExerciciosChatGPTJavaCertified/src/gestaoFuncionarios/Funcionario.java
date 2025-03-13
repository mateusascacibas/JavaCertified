package gestaoFuncionarios;

public abstract class Funcionario {
    protected String nome;
    protected double salario;
    private static int totalFuncionarios = 0;

    static {
        System.out.println("Sistema de Funcionários Iniciado!");
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        totalFuncionarios++;
    }

    public abstract double calcularBonus();

    public void exibirInfo() {
        System.out.println("Nome: " + nome + " | Salário: " + salario + " | Bônus: " + calcularBonus());
    }

    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }
}
