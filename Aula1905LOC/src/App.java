public class App {
    public static void main(String[] args) throws Exception {
        /* Criar instancia */
        Carro C1 = new Carro("Civic", "Honda", 2020, "Azul");
        System.out.println("Modelo do carro 1: " + C1.getModelo());
        System.out.println("Marca do carro 1: " + C1.getMarca());
        System.out.println("Ano do carro 1: " + C1.getAno());
        System.out.println("Cor do carro1: " + C1.getCor());

        C1.setMarca("fiat");
        C1.setModelo("palio");
        C1.setAno(2021);
        C1.setCor("Branco");
        /*
         * As mudanças dos atributos tem que colocar antes das impressão, ou colocar de
         * novo as impressões
         */
        System.out.println("Modelo do carro 1: " + C1.getModelo());
        System.out.println("Marca do carro 1: " + C1.getMarca());
        System.out.println("Ano do carro 1: " + C1.getAno());
        System.out.println("Cor do carro1: " + C1.getCor());

    }
}
