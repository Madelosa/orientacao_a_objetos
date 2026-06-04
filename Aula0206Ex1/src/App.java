public class App {
    public static void main(String[] args) throws Exception {
        Livro[] estante = new Livro[3];
        estante[0] = new Livro("Herry Potter", "J.K Rowlig");
        estante[1] = new Livro("O codigo DaVinci", "Dan Brown");
        estante[2] = new Livro("Arte da Guerra", "Sun Tzu");

        /*
         * for (int i = 0; i < estante.length; i++) {
         * System.out.println(estante[i].getTitulo());
         * }
         */
        /* executa como o for mas é mais simple essa outra forma */
        for (Livro i : estante) {
            System.out.println(i.getTitulo());
        }
    }
}
