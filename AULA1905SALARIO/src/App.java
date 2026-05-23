public class App {
    public static void main(String[] args) throws Exception {

        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Ana";
        funcionario1.salario = 1500;

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Carlos";
        funcionario2.salario = 2000;

        funcionario1.receberAumento(200);
        funcionario2.receberAumento(300);

        System.out.println("Novo salario: " + funcionario1.salario);
        System.out.println("Novo Salario: " + funcionario2.salario);

    }
}
