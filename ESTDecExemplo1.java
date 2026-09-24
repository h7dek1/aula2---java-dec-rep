import javax.swing.JOptionPane;
//Desenvolva um algoritmo que receba um valor numerico real, verifique
//e mostre se esse número é positivo.
public class ESTDecExemplo1
{
    public static void main (String args [] )
    {
        double x;
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));
        if (x>0)
        {
            JOptionPane.showMessageDialog(null, x + " é positivo");
        }
    }
}