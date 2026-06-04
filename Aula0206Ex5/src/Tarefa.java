public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String d) {
        this.descricao = d;
        this.concluida = false;
    }

    public void finalizarTarefa() {
        this.concluida = true;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getConcluida() {
        return true;
    }

}
