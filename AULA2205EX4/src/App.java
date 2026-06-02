public class App {
    public static void main(String[] args) throws Exception {
        MaquinaDeCafe m1 = new MaquinaDeCafe();
        m1.fazerCafe(); /* tava vazia começou com 0 */
        m1.recargar(4); /* recargou */
        m1.fazerCafe();
        m1.fazerCafe();
        m1.fazerCafe();
        m1.fazerCafe();
        m1.fazerCafe(); /* ficou vazia */
    }
}
/* */