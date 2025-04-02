public class OperacionesAvanzadas {

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No existe raíz real de números negativos");
        }
        return Math.sqrt(numero);
    }

    public double modulo(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return dividendo % divisor;
    }

    public double valorAbsoluto(double numero) {
        return Math.abs(numero);
    }
}
