import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Musica> musicas = new ArrayList<>();

        musicas.add(new Musica("Tu pirata soy yo", "Chayanne"));
        musicas.add(new Musica("Ya te olvide", "sss"));
        musicas.add(new Musica("ggg", "bjj"));

        for (Musica m : musicas) {
            System.out.println("tocando" + m.getTitulo() + " - " + m.getArtista());
        }
    }
}
