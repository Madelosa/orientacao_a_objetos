public class App {
    public static void main(String[] args) throws Exception {
        /* realizamos constructor */
        ContaBancaria conta1 = new ContaBancaria("Mauricio");

        /* os métodos são sempre públicos e os atributos privados */
        double saldo = conta1.getSaldo();
        System.out.println("Saldo atual: " + saldo);

        conta1.depositar(200);
        System.out.println("Saldo atual: " + saldo);

        conta1.sacar(500);
        saldo = conta1.getSaldo();
        System.out.println("saldo atual: " + saldo);

        conta1.sacar(50);
        saldo = conta1.getSaldo();
        System.out.println("Saldo atual: " + saldo);

    }
}
