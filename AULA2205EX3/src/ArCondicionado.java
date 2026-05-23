public class ArCondicionado {
    /* 1 Criar atributos */
    private String marca;
    private int temperatura;
    private boolean status;

    /* 2 Criar constructor */

    public ArCondicionado(String marca) {
        this.marca = marca;
        this.temperatura = 24;
        this.status = false;
    }

    /* 3 Criar métodos */
    public void ligar() {
        this.status = true;
    }

    public void desligar() {
        this.status = false;
    }

    /* 4 */

    public void aumentarTemperatura() {
        if (this.status == true) {
            if (this.temperatura < 30) {
                this.temperatura++;
                System.out.println("Temperatura aumentada!");
            } else {
                System.out.println("Temperatura máxima!");
            }
        } else {
            System.out.println("o ar esta desligado!");
        }
    }

    public void diminuirTemperatura() {
        if (this.status == true) {

            if (this.temperatura < 30) {
                this.temperatura--;
                System.out.println("Temperatura diminuida!");
            } else {
                System.out.println("Temperatura mínima!");
            }

        } else {
            System.out.println("o ar esta desligado!");
        }
    }
}
