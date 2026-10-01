import javax.swing.JOptionPane;
//Receba o preço atual e a média mensal de um produto.
//Calcule e mostre o novo preço sabendo que:
//Venda Mensal	    Preço Atual	      Preço Novo
//< 500	               < 30	        +10%
//>= 500 e < 1000   >= 30 e < 80        +15%
//>= 1000	       >= 80	        -5%
//Obs: para outras condições, preço novo será igual ao preço atual.
public class ESTDec28 {
    public static void main (String args [] ) {
        double atualP, finalP, mediaM;
        atualP = Double.parseDouble(JOptionPane.showInputDialog("Defina o preço atual."));
        mediaM = Double.parseDouble(JOptionPane.showInputDialog("Média de vendas do produto."));
        
        if (atualP < 30 && mediaM <500) {
            finalP = (atualP * 1.10);
            JOptionPane.showMessageDialog(null, "O novo preço com reajuste de 10% é R$" +finalP);
        }   
            else if (atualP >=30 || atualP <80 && mediaM >=500 || mediaM <1000) {
                finalP = (atualP * 1.15);
                JOptionPane.showMessageDialog(null, "O novo preço com reajuste de 15% é R$" +finalP);
            }
                else if (atualP >=80 && mediaM >=1000) {
                    finalP = (atualP * 0.95);
                    JOptionPane.showMessageDialog(null, "O novo preço com reajuste de -5% é R$" +finalP);
                }
                    else {
                        finalP = atualP;
                        JOptionPane.showMessageDialog(null, "O preço se mantém R$" +finalP);
                    }
    }
}
