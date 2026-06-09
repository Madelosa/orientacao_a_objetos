public abstract class Quarto implements Financeiro {
    protected int numero;
    protected double precoBase;
    protected boolean isOcupado;

    public Quarto(int n, double pB) {
        this.numero = n;
        this.precoBase = pB;
        this.isOcupado = false;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getPrecoBase() {
        return this.precoBase;
    }

    public boolean getIsOcupado() {
        return this.isOcupado;
    }

    public void setIsoOcupado(boolean status) {
        this.isOcupado = status;

    }
}

/*
 * setIsocupado vai mudar o status se esta ocupado ou desocupado
 * não passo parametro de isocupado no construtor porque cada vez que vou
 * ingresar um quarto e um valor
 * o quarto é false porque esta desocupado
 * Todo metodo set recebe parametro porque vai mudar o status
 * get não recebe parametri
 */
