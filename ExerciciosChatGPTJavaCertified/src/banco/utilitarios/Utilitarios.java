package banco.utilitarios;

public class Utilitarios {
	
	public static final double TAXA_PADRAO = 5;
	
	public static void calcularJuros(double valor, double taxa) {
		System.out.println("Juros aplicados: R$ " + valor * (taxa/100));
	}

}
