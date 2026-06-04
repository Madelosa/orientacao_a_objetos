public class Musica {
    private String titulo;
    private String artista;

    public Musica(String t, String a) {
        this.titulo = t;
        this.artista = a;
    }

    public String getArtista() {
        return this.artista;
    }

    public String getTitulo() {
        return this.titulo;
    }
}
