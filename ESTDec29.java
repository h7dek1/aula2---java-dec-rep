import javax.swing.JOptionPane;
//Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento.
//Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%.
//Demais tipos não serão considerados.
public class ESTDec29 {
    public static void main (String args [] ) {
        double vlrI, vlrC;
        int tipo;
        vlrI = Double.parseDouble(JOptionPane.showInputDialog("Defina o valor do investimento. "));
        tipo = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo de investimento? 1 - Poupança | 2 - Renda Fixa. "));
        
        if (tipo == 1) {
            vlrC = (vlrI * 1.03);
            JOptionPane.showMessageDialog(null,"O valor corrigido em 30 dias será de R$" +vlrC);
        }
        else {
            vlrC = (vlrI * 1.05);
            JOptionPane.showMessageDialog(null,"O valor corrigido em 30 dias será de R$" +vlrC);
        }
    }
}
