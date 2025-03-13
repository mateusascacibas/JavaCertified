package gestaoFuncionarios;

public class Utils {
    public static void calcularGastosTotais(Empresa empresa) {
        double total = 0;
        for (Funcionario f : empresa.funcionarios) {
            total += f.salario + f.calcularBonus();
        }
        System.out.println("Total de gastos com funcionários: R$ " + total);
    }
}
