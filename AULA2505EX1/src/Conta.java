public class Conta {
    protected String titular;
    protected double saldo;

    /* constructor */
    public Conta(String t) {
        this.titular = t;
        this.saldo = 0.0;
    }

    /* método depositar */
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        System.out.println("Deposito concluido!");
    }

    /* criar método getSaldo */
    public double getSaldo() {
        return this.saldo;
    }

}
