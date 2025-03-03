package sistemaControlePontos;

public enum Nivel {
	INICIANTE("Iniciante"),
	BRONZE("Bronze"),
	PRATA("Prata"),
	OURO("Ouro"),
	DIAMANTE("Diamante"),;

	private String nivel;
	
	Nivel(String nivel) {
		this.nivel = nivel;
	}
	
	public String getNivel() {
		return this.nivel;
	}
			
}
