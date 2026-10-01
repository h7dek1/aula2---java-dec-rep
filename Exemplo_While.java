import javax.swing.JOptionPane;
public class Exemplo_While {
    public static void main (String args [] ) {
        int num, quad;
        num = 10;
        while (num >=10 && num <=150) {
            quad = (num * num);
            System.out.println("O quadrado de " +num+ " é: " +quad);
            num = num + 1;
        }
    }
}
