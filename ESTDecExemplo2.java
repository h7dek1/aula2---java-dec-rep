import javax.swing.JOptionPane;
//Desenvolva um algoritmo que receba 3 valores numericos inteiros, mostrre a soma desses 3 numeros,
//verifique e mostre se a soma é maior que 100.
public class ESTDecExemplo2
{
    public static void main (String args [] )
    {
        int n1, n2, n3, soma;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inteiro 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inteiro 2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inteiro 3: "));
        
        soma = (n1 + n2 + n3);
            JOptionPane.showMessageDialog(null, "A soma dos 3 valores é: " +soma);
        if (soma > 100)
        {
            JOptionPane.showMessageDialog(null, "A soma é maior que 100");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "A soma é menor ou igual a 100");
        }
    }
}
