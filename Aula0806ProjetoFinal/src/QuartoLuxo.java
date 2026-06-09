public class QuartoLuxo extends Quarto {

    public QuartoLuxo(int n, double pB) {
        super(n, pB);
    }

    @Override
    public double calcularTotal(int diarias) {
        return this.precoBase * diarias * 1.20;
    }
}
