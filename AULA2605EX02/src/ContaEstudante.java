/*classe */
public class ContaEstudante extends Conta {
    /* construtor */
    public ContaEstudante(int n, double s) {
        super(n, s);
    }

    /* método */
    @Override
    public void cobrarTarifa() {
        this.saldo = this.saldo - 0;
        System.out.println("Saldo: " + this.saldo);

    }

}
