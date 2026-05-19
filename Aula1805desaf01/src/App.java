public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto();

        produto1.nome = "Notebook";
        produto1.preco = 2000;
        produto1.quantidadeEstoque = 25;

        System.out.println("Valor total estoque Notebook: " + produto1.preco * produto1.quantidadeEstoque);

        Produto produto2 = new Produto();

        produto2.nome = "Mouse";
        produto2.preco = 150.0;
        produto2.quantidadeEstoque = 50;

        System.out.println("Valor total estoque Mouse: " + produto2.preco * produto2.quantidadeEstoque);

        produto1.adicionarEstoque(15);
        System.out.println("QTD Estoque produto1:" + produto1.quantidadeEstoque);

        produto1.adicionarEstoque(50);
        System.out.println("QTD Estoque produto1:" + produto1.quantidadeEstoque);

        produto2.adicionarEstoque(10);
        System.out.println("QTD Estoque produto1:" + produto2.quantidadeEstoque);

    }
}
