public class App {
    public static void main(String[] args) throws Exception {
        MaquinaDeCafe m1 = new MaquinaDeCafe();
        m1.fazerCafe();
        m1.recargar(4);
        m1.fazerCafe();
    }
}
