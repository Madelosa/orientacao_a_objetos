public class App {
    public static void main(String[] args) throws Exception {
        Assinatura a1 = new Assinatura(0);
        AssinaturaPremium ap1 = new AssinaturaPremium(0);

        a1.exibirBeneficios();
        ap1.exibirBeneficios();
    }
}
