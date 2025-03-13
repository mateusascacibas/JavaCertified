package gestaoFuncionarios;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    protected List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void listarFuncionarios() {
        System.out.println("---- Lista de Funcionários ----");
        for (Funcionario f : funcionarios) {
            f.exibirInfo();
            System.out.println("-------------------");
        }
    }
}
