import javax.swing.JOptionPane;
//Receba a hora de início e de final de um jogo (HH,MM) sabendo que o tempo máximo é de 24 horas
//e pode começar num dia e terminar noutro.
public class ESTDec25 {
    public static void main (String args [] ) {
        int hi, mi, hf, mf, tempoi, tempof, duracaot, duracaoh, duracaom;
        hi = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial: "));
        mi = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial: "));
        hf = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final: "));
        mf = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final: "));
                       
        tempof= ((hf*60) + mf);
        tempoi= ((hi*60) + mi);
        
        if (tempof <= tempoi) {
            duracaot = ((tempof +1440) - tempoi);
        }
        else {
            duracaot = (tempof - tempoi);
        }
        duracaoh = duracaot / 60;
        duracaom = duracaot % 60;
            JOptionPane.showMessageDialog(null, "A duração do jogo foi de: " +duracaoh+ ":" +duracaom);
    }
}
