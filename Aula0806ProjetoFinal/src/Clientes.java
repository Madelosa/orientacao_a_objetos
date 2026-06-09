public class Clientes {
    private String nome;
    private String cpf;

    public Clientes(String n, String cpf) {
        this.nome = n;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }
}
/* neste caso é private porque o cliente não vai ter uma super classe */