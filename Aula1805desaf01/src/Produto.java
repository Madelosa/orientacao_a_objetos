public class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;

    /* as funções vão alterar o valor de um atributo */

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque = this.quantidadeEstoque + quantidade;

        System.out.println("Estoque atualizado!");
    }

}
