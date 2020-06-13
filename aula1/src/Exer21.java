import javax.swing.*;

public class Exer21 {
    public static void main(String[] args) {
        String qtd= JOptionPane.showInputDialog("Digite quantos filhos você tem:");
        int filhos = Integer.parseInt(qtd);
        int ct=1;
        String rel="";
        while(ct<=filhos){
            String nome = JOptionPane.showInputDialog("Digite o " + ct + "o nome:");
            String idade = JOptionPane.showInputDialog("Digite a " + ct + "o idade:");
            String item="nome = "+nome+" idade = "+idade+"\n";
            rel+=item;
            ct++;
        }
        JOptionPane.showMessageDialog(null,rel);
        System.exit(0);
    }
}
