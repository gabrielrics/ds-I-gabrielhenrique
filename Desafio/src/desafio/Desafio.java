/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio;

import javax.swing.JOptionPane;

public class Desafio {

    void triangulo() {
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Coloque o Primeiro número: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Coloque o Segundo número: "));
            int c = Integer.parseInt(JOptionPane.showInputDialog("Coloque o Terceiro número: "));

            if (a == a || a == b || a == c || b == b || b == c || c == c) {
                System.out.println("isso é um triângulo");
            } else if (a == 0 || b == 0 || c == 0) {
                System.out.println("INVÁLIDO");
            } else {
                System.out.println("INVÁLIDO");
            }

        } catch (Exception e) {
            System.out.println("Esse caractere não é pertencente");
        }
    }

    void quadrado() {
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Coloque o Primeiro número: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Coloque o Segundo número: "));
            int c = Integer.parseInt(JOptionPane.showInputDialog("Coloque o Terceiro número: "));
            int d = Integer.parseInt(JOptionPane.showInputDialog("Coloque o Quarto número: "));

            if (a == b && a == c && b == c && d == a && d == b && d == c) {
                System.out.println("É um quadrado");
            } else if (a == 0 || b == 0 || c == 0) {
                System.out.println("INVÁLIDO");
            } else if (a != b || a != c || b != c || d != a || d != b || d != c) {
                System.out.println("Não é um quadrado");
            } else {
                System.out.println("INVÁLIDO");
            }
        } catch (Exception e) {
            System.out.println("Esse caractere não é pertencente");
        }

    }

    void retangulo() {
        try {
            double b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B(base)"));
            double h = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor h(altura)"));
            
            double area = b*h;
            
            JOptionPane.showMessageDialog(null, "A área  do retângulo:" + area + "m2.");
            
        } catch (Exception e) {
            System.out.println("Esse caractere não é pertencente");
        }
    }

}

//desafio x = new desafio
    
//TRY
