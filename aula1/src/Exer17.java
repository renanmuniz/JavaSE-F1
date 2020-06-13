import javax.swing.*;

public class Exer17 {
    public static void main(String[] args) {
        String idade = JOptionPane.showInputDialog("Qual é sua idade?");
        int vl = Integer.parseInt(idade);
        String relatorio = "";
        if(vl >= 18){
            relatorio = "Você já pode tirar carteira de motorista";
        } else{
            relatorio = "Você ainda não pode tirar carteira de motorista";
        }
        JOptionPane.showMessageDialog(null, relatorio);
        System.exit(0);
    }
}
