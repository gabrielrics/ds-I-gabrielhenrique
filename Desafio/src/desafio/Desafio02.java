/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;
import javax.swing.JOptionPane;
public class Desafio02 {
        public static void main(String[] args) {
        
    }
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Coloque o Primeiro número: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Coloque o Segundo número: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Coloque o Terceiro número: "));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Coloque o Quarto número: "));
        
        if(a == a||a == b || a == c || a == d ||b == b|| b == c || b == d || c == c || c == d || d == d){
            System.out.println("isso é um quadrado.");
        }else if(a == 0 || b == 0 || c == 0 || d == 0){
            System.out.println("INVÁLIDO");
}
    
}
}
