import javax.swing.JOptionPane;
//24.	Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
public class ESTDec24 {
    public static void main (String args [] ) {
        int n1, div2, div3;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        div2 = (n1%2) ;
        div3 = (n1%3) ;
        
        if (div2 == 0 && div3 == 0) {
            JOptionPane.showMessageDialog(null, "É divísivel por 2 e 3");
        }
            else {
                JOptionPane.showMessageDialog(null, "Não é divísivel por 2 e 3");
        }
    }
}