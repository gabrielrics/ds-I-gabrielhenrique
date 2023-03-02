package ProcedimentoAutomatico;

import javax.swing.JOptionPane;

public class OperadorAutomatico {

    void soma () {
//Void: Envia dados
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
        int soma = a + b;
        
        JOptionPane.showMessageDialog(null, "O valor da soma é: " + soma);
        
    }
    void subtracao () {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        int subtracao = a - b;
        
            JOptionPane.showMessageDialog(null, "O valor da subtração é: " + subtracao);
    }
    void multiplicacao () {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
        int multiplicacao = a * b;
        
            JOptionPane.showMessageDialog(null, "O valor da multiplicação é: " + multiplicacao);
    }
    void divisao () {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        int divisao = a / b;
        
            JOptionPane.showMessageDialog(null, "O valor da divisão é: " + divisao);

    }
}
