public class Aluno {
    private String nome;
    private double prova1;
    private double prova2;

    /* construtor */

    public Aluno(String n, double p1, double p2) {
        this.nome = n;
        this.prova1 = p1;
        this.prova2 = p2;
    }

    /* metodo get */
    public double getMedia() {
        return (this.prova1 + this.prova2) / 2;
    }

}
