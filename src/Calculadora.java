
/**
 * La clase {@code Calculadora} se utiliza para acceder a instancias de {@code OperacionesBasicas} y {@code OperacionesAvanzadas}.
 * 
 * @author Paco
 * @version 1.0
 */
public class Calculadora {
    private OperacionesBasicas basicas;
    private OperacionesAvanzadas avanzadas;

    /**
     * Constructor de la clase {@code Calculadora}.
     * Inicializa las instancias de {@code OperacionesBasicas} y {@code OperacionesAvanzadas}.
     */    
    public Calculadora() {
        this.basicas = new OperacionesBasicas();
        this.avanzadas = new OperacionesAvanzadas();
    }

    /**
     * Obtiene el objeto de operaciones básicas.
     * 
     * @return una instancia de {@code OperacionesBasicas}
     */

    public OperacionesBasicas getBasicas() {
        return basicas;
    }

    /**
     * Obtiene el objeto de operaciones avanzadas.
     * 
     * @return una instancia de {@code OperacionesAvanzadas}
     */

    public OperacionesAvanzadas getAvanzadas() {
        return avanzadas;
    }
}