package Procedimento;

import javax.swing.JOptionPane;

public class Operador {

    void soma () {
//Void: Envia dados
        int a = 10;
        int b = 10;
        int soma = a + b;
        int multiplicacao = a * b;
        
        
        JOptionPane.showMessageDialog(null, "O valor da soma é: " + soma);
        
    }
    void subtracao () {
        int a = 10;
        int b = 10;
        int subtracao = a - b;
        
            JOptionPane.showMessageDialog(null, "O valor da subtração é: " + subtracao);
    }
    void multiplicacao () {
        int a = 10;
        int b = 10;
        int multiplicacao = a * b;
        
            JOptionPane.showMessageDialog(null, "O valor da multiplicação é: " + multiplicacao);
    }
    void divisao () {
        int a = 10;
        int b = 10;
        int divisao = a / b;
        
            JOptionPane.showMessageDialog(null, "O valor da divisão é: " + divisao);

    }
}
