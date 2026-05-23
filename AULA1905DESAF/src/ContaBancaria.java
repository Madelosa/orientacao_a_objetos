public class ContaBancaria {
    private String titular;
    private double saldo;

    /* Criar constructor */

    public ContaBancaria(String nomeTitular) {
        this.titular = nomeTitular;
        this.saldo = 0.0;
    }

    /* criar metodo getSaldo */
    public double getSaldo() {
        return this.saldo;
    }

    /* criar método depositar */
    public void depositar(double valorDepositado) {
        this.saldo = this.saldo + valorDepositado;
        System.out.println("Deposito realizado");
    }

    /* criar método sacar */
    public void sacar(double valorSacado) {
        if (this.saldo >= valorSacado) {
            this.saldo = this.saldo - valorSacado;
            System.out.println("Saque realizado");

        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
