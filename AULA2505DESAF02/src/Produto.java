public class Produto {
    protected String nome;
    protected double precoBase;

    public Produto(String n, double pb) {
        this.nome = n;
        this.precoBase = pb;
    }

    public double calcularPrecoFinal() {
        double imposto = this.precoBase * 0.1;
        return this.precoBase + imposto;
    }
}