package br.com.heidertreinamentos;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final int SOMAR = 1;
    private static final int SUBTRAIR = 2;
    private static final int MULTIPLICAR = 3;
    private static final int DIVIDIR = 4;

    public static void main( String[] args )
    {
        String msgResultado = "O resultado da operação é: ";
        Calculadora calc = new Calculadora();
        int op = Integer.parseInt(JOptionPane.showInputDialog("Informe a operacao desejada\n" +
                "1-Somar\n" +
                "2-Subtrair\n" +
                "3-Multiplicar\n4Multiplicar"));
        int v1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
        int v2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));

        switch(op) {
            case SOMAR:
                JOptionPane.showMessageDialog(null, msgResultado + calc.somar(v1, v2));
                break;

            case SUBTRAIR:
                JOptionPane.showMessageDialog(null, msgResultado + calc.subtrair(v1, v2));
                break;

            case MULTIPLICAR:
                JOptionPane.showMessageDialog(null, msgResultado + calc.multiplicar(v1, v2));
                break;

            case DIVIDIR:
                JOptionPane.showMessageDialog(null, msgResultado + calc.dividir(v1, v2));
                break;
        }
    }
}
