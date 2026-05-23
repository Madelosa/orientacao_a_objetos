public class Livro {
    /* criar clase e Adicionar caracteres */
    String titulo;
    String autor;
    boolean disponivel;

    /* criar metodos emprestar e devolver */

    public void emprestar() {
        if (this.disponivel == true) {
            this.disponivel = false;
            System.out.println("Emprestamo realizado");
        } else {
            System.out.println("Livro indisponivel");
        }
    }

    public void devolver() {
        this.disponivel = true;
        System.out.println("Livro devolvido");
    }
}
