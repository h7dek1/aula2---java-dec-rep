import javax.swing.JOptionPane;
//Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
public class Exemplo_While2 {
    public static void main (String args [] ) {
        int d1, d2;
        d1 = 1;
        d2 = 6;
        int i = 1;
        while(i <=6) {
            if (d1 + d2 ==7) {
                System.out.println(d1+ "+" +d2+ "=7");
            }
            d1 = d1 + 1;
            d2 = d2 - 1;
            i = i + 1;
        }
    }
}
