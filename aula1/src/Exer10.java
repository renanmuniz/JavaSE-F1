import javax.swing.*;

public class Exer10 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String sobre = JOptionPane.showInputDialog("Digite seu sobrenome:");
        String completo = nome + ' ' + sobre;
        JOptionPane.showMessageDialog(null,completo);
        System.exit(0);
    }
}
