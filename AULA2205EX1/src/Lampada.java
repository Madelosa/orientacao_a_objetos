public class Lampada {
    private boolean ligada;
    private String cor;

    /* construtor */
    public Lampada(String corInicial) {
        this.cor = corInicial;
        this.ligada = false;
    }

    /* método ligar */
    public void ligar() {
        this.ligada = true;
    }

    /* metodo desligar */
    public void desligar() {
        this.ligada = false;
    }

    /* Metodo para dizer a cor */
    public void imprimirEstatus() {
        if (this.ligada == true) {
            System.out.println("LIGADA!");

        } else {
            System.out.println("DESLIGADA");
        }
        System.out.println("COR: " + this.cor);
    }
}
