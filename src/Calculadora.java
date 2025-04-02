
public class Calculadora {
    private OperacionesBasicas basicas;
    private OperacionesAvanzadas avanzadas;

    public Calculadora() {
        this.basicas = new OperacionesBasicas();
        this.avanzadas = new OperacionesAvanzadas();
    }

    public OperacionesBasicas getBasicas() {
        return basicas;
    }

    public OperacionesAvanzadas getAvanzadas() {
        return avanzadas;
    }
}