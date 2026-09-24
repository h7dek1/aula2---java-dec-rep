import javax.swing.JOptionPane;
//Receba 2 valores inteiros e diferentes. Mostre seus valortes em ordem crescente.
public class ESTDec22 {
    public static void main (String args [] ) {
        int i1, i2;
        i1 = Integer.parseInt(JOptionPane.showInputDialog("Defina I1: "));
        i2 = Integer.parseInt(JOptionPane.showInputDialog("Defina I2 diferente de I1: "));
        
        if (i1 > i2) {
            JOptionPane.showMessageDialog(null, "Os valores em ordem crescente são: " +i2+ " | " +i1+ "");
        }
        else {
            JOptionPane.showMessageDialog(null, "Os valores em ordem crescente são: " +i1+ " | " +i2+ "");
        }
    }
}
