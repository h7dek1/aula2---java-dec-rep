import javax.swing.JOptionPane;
//Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos).Calcule e mostre a velocidade média em km/h.
public class ESTDec27 {
    public static void main (String args [] ) {
        int vol, ext, dur;
        double vel;
        vol = Integer.parseInt(JOptionPane.showInputDialog("Defina o número de voltas."));
        ext = Integer.parseInt(JOptionPane.showInputDialog("Defina a extensão do circuito em metros."));
        dur = Integer.parseInt(JOptionPane.showInputDialog("Defin o tempo de duração e minutos."));
        
        vel = (((vol * ext) / (dur*60.0)) * 3.6);
            JOptionPane.showMessageDialog(null, "A velocidade média em km/h é: " +vel);
    }
}
