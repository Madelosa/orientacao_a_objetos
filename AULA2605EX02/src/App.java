public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta(1225, 2000);
        ContaEstudante e1 = new ContaEstudante(2563, 100);

        c1.cobrarTarifa();
        e1.cobrarTarifa();
    }
}
