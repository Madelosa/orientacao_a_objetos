public class AssinaturaPremium extends Assinatura {
    public AssinaturaPremium(double pb) {
        super(pb);
    }

    @Override
    public void exibirBeneficios(String filme) {
        System.out.println("Filmes em 4k + sem Anúncios");

    }
}
