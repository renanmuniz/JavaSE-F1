import javax.swing.*;

public class Exer24 {
    public static void main(String[] args) {
        String qtd = JOptionPane.showInputDialog("Digite a quantidade de filhos:");
        int filhos = Integer.parseInt(qtd);
        String rel = "";

        for(int ct=1;ct<=filhos;ct++){
            String nome = JOptionPane.showInputDialog("Digite o " + ct + "o nome:");
            String idade = JOptionPane.showInputDialog("Digite a " + ct + "a idade:");
            String item = "nome= " +nome + " idade= " + idade + "\n";
            rel+=item;
        }
        JOptionPane.showMessageDialog(null,rel);
        System.exit(0);
    }
}
