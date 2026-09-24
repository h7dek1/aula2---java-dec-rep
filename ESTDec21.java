import javax.swing.JOptionPane;
//Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
//Mostre a mensagem de acordo com a média. ( >= 6 "Aprovado") ( >= 3 ou < 6 "Exame") ( < 3 "Retido")
public class ESTDec21 {
    public static void main (String args [] ) {
        double n1, n2, n3, n4, media;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Defina a nota 1: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Defina a nota 2: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Defina a nota 3: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Defina a nota 4: "));
        
        media = ((n1 + n2 + n3 + n4) / 4);
            JOptionPane.showMessageDialog(null, "A média é: " +media);
        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "Aprovado");
        }
        else {
            if (media < 3) {
                JOptionPane.showMessageDialog(null, "Retido");
            }
            else {
                JOptionPane.showMessageDialog(null, "Exame");
            }
        }
    }
    
}
