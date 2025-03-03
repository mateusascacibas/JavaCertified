package banco;

import static banco.utilitarios.Utilitarios.TAXA_PADRAO;
import static banco.utilitarios.Utilitarios.calcularJuros;

import banco.contas.ContaBancaria;;

public class Main {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria("Mateus", 500);
		c1.exibirSaldo();
		calcularJuros(c1.getSaldo(), TAXA_PADRAO);
		
	}

}
