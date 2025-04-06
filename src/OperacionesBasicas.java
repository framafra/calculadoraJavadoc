/**
* En esta clase vamos a realizar operaciones básicas de calculadora
*
* @author Paco
* @version 1.0
*/
public class OperacionesBasicas {
    /**
     * Operación básica de calculadora de SUMAR
     * 
     * @param a Primer número
     * @param b Segundo número
     * @return La suma de a y b
     */
    public double sumar(double a, double b) {
        return a + b;
    }
    /**
     * Operación básica de calculadora de RESTAR
     * 
     * @param a Primer número
     * @param b Segundo número
     * @return La resta de a y b
     */
    public double restar(double a, double b) {
        return a - b;
    }
    /**
     * Operación básica de calculadora de MULTIPLICAR
     * 
     * @param a Primer número
     * @param b Segundo número
     * @return La multiplicación de a y b
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }
    /**
     * Operación básica de calculadora de DIVIDIR
     * 
     * @param a Primer número
     * @param b Segundo número
     * @return La división de a y b
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}
