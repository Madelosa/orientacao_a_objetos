public class ProdutoFisico extends Produto {

    public ProdutoFisico(String n, double pb) {
        super(n, pb);
    }

    /*
     * * o @override: esse metodo ja existe na mãe e aqui vai adicionar outra coisa,
     * neste caso* adicionamos o frete
     */
    @Override
    public double calcularPrecoFinal() {
        double imposto = precoBase * 0.10;
        double frete = 50.0;
        return this.precoBase + imposto + frete;

    }

}
