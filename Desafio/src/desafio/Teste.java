
package desafio;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
            Desafio x = new Desafio();
         int desafio = Integer.parseInt(JOptionPane.showInputDialog("Digite: 1 para triângulo, 2 para quadrado e 3 para retângulo"));
         
         if(desafio== 1){
             x.triangulo();
         }else if(desafio == 2){
             x.quadrado();
         }else if(desafio == 3){
             x.retangulo();
         }else{
             System.out.println("INVÁLIDO, apenas: 1(triângulo), 2(quadrado) e 3(retângulo)");
         }
        
    }
}
