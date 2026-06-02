public class Funcionario {
    protected String nome;
    protected double salario;

    /* constructor */
    public Funcionario(String n, double s) {
        this.nome = n;
        this.salario = s;
    }

    /* Método calcular bonus */
    public double calcularBonus() {
        return this.salario * 0.1;
    }
}