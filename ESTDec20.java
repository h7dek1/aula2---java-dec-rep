import javax.swing.JOptionPane;
//Receba 3 coeficientes: A, B e C de uma equação de 2°grau da formula AX2+BX+C=0.
//Verifique e mostre a existencia de raizes reais e se caso exista, calcule e mostre.
public class ESTDec20 {
    public static void main (String args [] ) {
        double a, b, c, rr;
        a = Double.parseDouble(JOptionPane.showInputDialog("Defina o valor de A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Defina o valor de B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Defina o valor de C: "));        
    }
}
