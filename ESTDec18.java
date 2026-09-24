import javax.swing.JOptionPane;
//Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.
public class ESTDec18
{
    public static void main (String args [] )
    {
        int n1, n2, dif;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Defina o valor de n1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Defina o valor de n2: "));
        
       if (n1 > n2)
       {
           dif = (n1 - n2);
                JOptionPane.showMessageDialog(null,"A Diferença de n1 por n2 é: " +dif);
       }
            else
        {
            dif = (n2 - n1);
                JOptionPane.showMessageDialog(null, "A diferença de n2 por n1 é: " +dif);
        }
       
    }
}
