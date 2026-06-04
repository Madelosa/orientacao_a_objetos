public class Livro {
    private String titulo;
    private String autor;

    /* construtor */
    public Livro(String t, String a) {
        this.titulo = t;
        this.autor = a;
    }

    /* MÉTODO get */
    public String getTitulo() {
        return this.titulo;
    }
}
