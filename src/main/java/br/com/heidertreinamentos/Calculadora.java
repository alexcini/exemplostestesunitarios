package br.com.heidertreinamentos;

/**
 * Created by heider
 */
public class Calculadora {

    public int somar(int v1, int v2) {
        return v1 + v2;
    }

    public int subtrair(int v1, int v2) {
        return v1 - v2;
    }

    public int multiplicar(int v1, int v2) {
        return v1 * v2;
    }

    public int dividir(int v1, int v2) throws ArithmeticException{
        return v1 / v2;
    }
}
