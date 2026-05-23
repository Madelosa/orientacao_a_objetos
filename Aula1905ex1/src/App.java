public class App {
    public static void main(String[] args) throws Exception {

        Livro livro1 = new Livro();

        livro1.titulo = "Harry potter 1";
        livro1.autor = "J.K Rowling";
        livro1.disponivel = true;
        /* emprestado */
        livro1.emprestar();
        /* não tem disponivel vira false */
        livro1.emprestar();

        /* Devolvido */
        livro1.devolver();
        /* Disponivel de novo */
        livro1.emprestar();

    }
}
