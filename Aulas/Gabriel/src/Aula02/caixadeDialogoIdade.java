package Aula02;
import javax.swing.JOptionPane;

public class caixadeDialogoIdade {

    public static void main(String[] args) {

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));

        JOptionPane.showConfirmDialog(null, "Sua idade é: " + idade);

    }
}
