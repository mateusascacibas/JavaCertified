package gestaoFuncionarios;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Criando funcionários
        Funcionario f1 = new Efetivo("Mateus", 5000);
        Funcionario f2 = new Temporario("Dayelle", 4000, 6);
        Funcionario f3 = new Estagiario("Gabriel", 1500);

        // Adicionando à empresa
        empresa.adicionarFuncionario(f1);
        empresa.adicionarFuncionario(f2);
        empresa.adicionarFuncionario(f3);

        // Exibindo funcionários
        empresa.listarFuncionarios();

        // Calculando gastos
        Utils.calcularGastosTotais(empresa);

        // Mostrando total de funcionários
        System.out.println("Total de funcionários: " + Funcionario.getTotalFuncionarios());
    }
}
