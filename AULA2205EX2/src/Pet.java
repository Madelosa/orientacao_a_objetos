public class Pet {
    /* 1 criar atributos */
    private String nome;
    private int energia;
    /* 2 criar construtor, dar o nomePet e dar valor da energia */

    public Pet(String nomePet) {
        this.nome = nomePet;
        this.energia = 100;
    }

    /* 3 Método brincar */
    public void brincar() {
        if (this.energia >= 20) {
            this.energia = this.energia - 20;
            System.out.println("O pet brincou!");
        } else {
            System.out.println("O pet esta cansado para brincar!");
        }
    }

    /* Método dormir */
    public void dormir() {
        this.energia = 100;
        System.out.println("O pet durmiu!");

    }
}
