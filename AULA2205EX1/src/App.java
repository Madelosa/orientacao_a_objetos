public class App {
    public static void main(String[] args) throws Exception {
        /* Instância depois que criamos os métodos */
        Lampada lampada = new Lampada("AZUL");

        lampada.ligar();
        lampada.imprimirEstatus();

        lampada.desligar();
        lampada.imprimirEstatus();

    }
}
