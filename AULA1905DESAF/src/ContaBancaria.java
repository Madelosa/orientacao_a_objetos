public class ContaBancaria {
    private String titular;
    private double saldo;

    /* Criar constructor */

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    /* criar metodo get */
    public String geString() {
        return this.titular;
    }
}
