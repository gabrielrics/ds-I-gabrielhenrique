package Aula02;

import javax.swing.JOptionPane;

public class caixadeDialogoNome {
    public static void main(String [] args) {
        
    String nome = JOptionPane.showInputDialog("Digite seu nome: ");
    JOptionPane.showMessageDialog(null, "Seu nome é: " + nome);
        
    }
    
}
