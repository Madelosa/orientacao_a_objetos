public class QuartoSimple extends Quarto {

    public QuartoSimple(int n, double pB) {
        super(n, pB);
    }

    @Override
    public double calcularTotal(int diarias) {
        return this.precoBase * diarias;

    }
}

/*
 * NÃO PRECISA DEFINIR VARIAVEIS, PORQUE AO COLOCAR EXTENDS QUARTO ELE PUXA
 * ESSES DADOS
 */