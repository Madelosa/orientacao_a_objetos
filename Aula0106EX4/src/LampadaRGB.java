public class LampadaRGB implements DispositivoInteligente {
    @Override
    public void ligar() {
        System.out.println("Ascendendo luz branca");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando lampada...");
    }
}
