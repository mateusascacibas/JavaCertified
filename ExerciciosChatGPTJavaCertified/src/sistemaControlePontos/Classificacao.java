package sistemaControlePontos;

public class Classificacao {
    public static String getClassificacao(int pontos) {
        if (pontos >= 0 && pontos <= 1000) {
            return Nivel.INICIANTE.getNivel();
        } else if (pontos <= 5000) {
            return Nivel.BRONZE.getNivel();
        } else if (pontos <= 10000) {
            return Nivel.PRATA.getNivel();
        } else if (pontos <= 50000) {
            return Nivel.OURO.getNivel();
        } else {
            return Nivel.DIAMANTE.getNivel();
        }
    }
}
