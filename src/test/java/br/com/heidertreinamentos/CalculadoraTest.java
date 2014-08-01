package br.com.heidertreinamentos;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by heider
 */
public class CalculadoraTest {

    @Test
    public void testSomar() {
        System.out.println("Somar");
        Calculadora calc = new Calculadora();
        int esperado = 7;
        int resultado = calc.somar(3, 4);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testSubtrair() {
        System.out.println("Subtrair");
        Calculadora calc = new Calculadora();
        int esperado = 7;
        int resultado = calc.subtrair(10, 3);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        Calculadora calc = new Calculadora();
        int esperado = 12;
        int resultado = calc.multiplicar(2, 6);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testDivisao() {
        System.out.println("Divisao");
        Calculadora calc = new Calculadora();
        int esperado = 7;
        int resultado = calc.dividir(21, 3);
        assertEquals(esperado, resultado);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisaoPorZero() {
        System.out.println("Divisao por zero");
        Calculadora calc = new Calculadora();
        int d = calc.dividir(21, 0);
    }
}
