import javax.swing.JOptionPane;
//Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
public class ESTDec26 {
    public static void main (String args [] ) {
        int n1, n2, mult, m2, m1;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Defina o valor de n1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Defina o valor de n2: "));
            
        if (n1%n2 ==0 || n2%n1 ==0){
            if (n1 > n2){
                JOptionPane.showMessageDialog(null, "n1 (" +n1+ ") é multiplo de n2 (" +n2+ ")");
            }
                else {
                    JOptionPane.showMessageDialog(null, "n2 (" +n2+ ") é multiplo de n1 (" +n1+ ")");
            }
        }
            else {
                if (n1 > n2) {
                    JOptionPane.showMessageDialog(null, "n1 (" +n1+ ") não é multiplo de n2 (" +n2+ ")");
                }
                    else {
                        JOptionPane.showMessageDialog(null, "n2 (" +n2+ ") não é multiplo de n1 (" +n1+ ")");
                }
        }
    }
}
