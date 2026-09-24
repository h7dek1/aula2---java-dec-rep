import javax.swing.JOptionPane;
//Dersenvolva um algoritmo que receba quatro notas bimestrais
//calcula e mostra a média aeirmetica dessas 4 notas bem como se o 
//aluno foi aprovado (media >= 7), reprovado (media < 3) ou em exame (media >= 3 e media <7)
public class ESTDecExemplo3
{
    public static void main (String args [] )
    {
        double n1, n2, n3, n4, media;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota1 bimestral: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota2 bimestral: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota3 bimestral: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota4 bimestral: "));
        
        media = ((n1 + n2 + n3 + n4) /4);
            JOptionPane.showMessageDialog(null, "A média é: " +media);
        if (media >= 7)
        {
            JOptionPane.showMessageDialog(null, "Aluno aprovado");
        }
            else
        {
                if (media < 3)
            {
                    JOptionPane.showMessageDialog(null, "Aluno reprovado");
            }
                else
            {
                    JOptionPane.showMessageDialog(null, "Aluno em exame");
            }
        }
    }
}
