public class App {
    public static void main(String[] args) throws Exception {
        Aluno[] classe = new Aluno[4];

        classe[0] = new Aluno("Luis", 9.8, 5.2);
        classe[1] = new Aluno("João", 10, 8.3);
        classe[2] = new Aluno("Maria", 7.5, 6.5);
        classe[3] = new Aluno("Pedro", 8.9, 7.2);

        double somaNotas = 0;

        for (int i = 0; i < classe.length; i++) {
            somaNotas += classe[i].getMedia();
        }

        System.out.println("Media da turma: " + somaNotas / classe.length);

    }
}
