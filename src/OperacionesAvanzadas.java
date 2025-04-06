
/**
* En esta clase vamos a realizar operaciones avanzadas de calculadora
* @author Paco
* @version 1.0
*/



public class OperacionesAvanzadas {

    
    /**
     * Operación avanzada de calculadora de POTENCIA
     * @param base Base
     * @param exponente Exponente
     * @return Base elevado al Exponente
     */
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    /**
     * Operación avanzada de calculadora de raiz cuadrada
     * @param numero Número
     * @return Raíz Cuadrada de Número
     */

    public double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No existe raíz real de números negativos");
        }
        return Math.sqrt(numero);
    }

    /**
     * Operación avanzada de calculadora de Módulo
     * @param dividendo Dividendo
     * @param divisor Divisor
     * @return Devuelve el resto de dividendo dividido divisor.
     */

    public double modulo(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return dividendo % divisor;
    }

    /**
     * Operación avanzada de calculadora de Valor Absoluto
     * @param numero Número
     * @return Devuelve el valor absoluto de Número.
     */

    public double valorAbsoluto(double numero) {
        return Math.abs(numero);
    }
}
