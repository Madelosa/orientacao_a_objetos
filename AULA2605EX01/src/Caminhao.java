/*classe filho-caminhao e chamar extends da mãe-veiculo */
public class Caminhao extends Veiculo {
    /* criar atributo exclusivo do caminhao capacideDeCarga */
    protected double capacidadeDeCarga;

    /*
     * construtor: toda classe tem um construtor, a classe caminhao tem o contrutor
     * caminhao e chamamos a super
     */
    public Caminhao(String p, int a, double c) {
        /* chamar super para repassar para mãe */
        super(p, a);
        /* Definir o valor do atributo capacidadDeCarga */
        this.capacidadeDeCarga = c;

    }

}
