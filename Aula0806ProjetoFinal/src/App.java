import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        Quarto[] quartos = new Quarto[5];

        quartos[0] = new QuartoSimple(101, 100.0);

        quartos[1] = new QuartoSimple(102, 100.0);

        quartos[2] = new QuartoSimple(103, 100.0);

        quartos[3] = new QuartoLuxo(104, 250.0);

        quartos[4] = new QuartoLuxo(105, 250.0);

        ArrayList<Clientes> clientes = new ArrayList<>();

        ArrayList<Hospedagem> hospedagens = new ArrayList<>();

        int opcao;
        do {

            System.out.println("=== Mapa de Quartos");

            for (Quarto q : quartos) {
                if (q.getIsOcupado()) {
                    System.out.println(q.getNumero() + " - [Ocupado]");

                } else {
                    System.out.println(q.getNumero() + " - Livre");
                }
            }

            System.out.println("1- Cadastrar Cliente");
            System.out.println("2- Check-in");
            System.out.println("3- Check-out");
            System.out.println("4- Balanço do Caixa");
            System.out.println("5- Sair");

            System.out.println("Digite uma opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    String nome = teclado.nextLine();

                    System.out.println("Digite o cpf do cliente: ");
                    String cpf = teclado.nextLine();

                    clientes.add(new Clientes(nome, cpf));
                    break;

                case 2:

                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println(i + " - " + clientes.get(i).getNome());
                    }

                    System.out.println("Digite o indice do cliente:");
                    int cid = teclado.nextInt();

                    System.out.println("Digite o número de quarto:");
                    int nQuarto = teclado.nextInt();

                    System.out.println("Digitre o número de diárias:");
                    int nDiarias = teclado.nextInt();

                    for (Quarto q : quartos) {
                        if (!q.getIsOcupado() && q.getNumero() == nQuarto) {
                            q.setIsoOcupado(true);
                            hospedagens.add(new Hospedagem(q, clientes.get(cid), nDiarias));
                            System.out.println("Hospedagem criada com sucesso!");
                            break;
                        }
                    }

                case 3:
                    System.out.println("Digite o numero de quarto para ckeckout:");
                    int nOut = teclado.nextInt();

                    for (Hospedagem h : hospedagens) {
                        if (h.getQuarto().getNumero() == nOut && h.getIsAtiva()) {

                            double total = h.getQuarto().calcularTotal(h.getDiarias());
                            System.out.println("Total a pagar: R$" + total);
                            h.getQuarto().setIsoOcupado(false);
                            h.setIsAtiva(false);
                            h.setValorTotal(total);
                            System.out.println("Checkout realizado");
                            break;
                        }
                    }
                    break;

                case 4:

                    double totalCaixa = 0.0;

                    for (Hospedagem h : hospedagens) {
                        if (!h.getIsAtiva()) {
                            totalCaixa += h.getValorTotal();
                        }
                    }
                    System.out.println("Balance total R$:" + totalCaixa);
                    break;

                case 5:
                    System.out.println("Fechando o programa...");
                    break;
                default:
                    System.out.println("Operação invalida!");
            }

        } while (opcao != 5);

    }
}
