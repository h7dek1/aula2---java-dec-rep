import javax.swing.JOptionPane;
//Receba 2 valores reais. Calcule e mostre o maior deles.
public class ESTDec19 {
    public static void main (String args [] ) {
        double r1, r2, maior;
        r1 = Double.parseDouble(JOptionPane.showInputDialog("Defina o valor de r1: "));
        r2 = Double.parseDouble(JOptionPane.showInputDialog("Defina o valor de r2: "));
        
        if (r1 > r2) {
            JOptionPane.showMessageDialog(null,"O Maior deles é r1: " +r1);
        }
        else {
            JOptionPane.showMessageDialog(null,"O Maior deles é r2: " +r2);
        }
    }  
}
