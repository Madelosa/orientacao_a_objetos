public class Conta {
    /* atributos */
    protected int numero;
    protected double saldo;

    /* construtor */
    public Conta(int n, double s) {
        this.numero = n;
        this.saldo = s;
    }

    /* método */
    public void cobrarTarifa() {
        this.saldo = this.saldo - 15.0;
        System.out.println("Saldo: " + this.saldo);
    }
}
