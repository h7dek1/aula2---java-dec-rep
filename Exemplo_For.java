import javax.swing.JOptionPane;
//Receba 2 números inteiros, verifique qual o maior entre eles.
//Calcule e mostre o resultado da somatória dos números ímpares entre esses valores
public class Exemplo_For {
    public static void main (String args [] ) {
        int n1, n2, imp, par = 0;
    
    n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina n1: "));
    n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina n2: "));
    
    if (n1 > n2) {
        System.out.println("O número maior é: " +n1);
        for (imp = n2; imp <= n1; imp++) {
            if (imp % 2 !=0) {
                par = par + imp;
            }
        }
        System.out.println("A somatória dos números ímpares é: " +par);
    }
    else {
        System.out.println("O número maior é: " +n2);
        for(imp = n1; imp<= n2; imp++) {
            if(imp % 2 != 0) {
                par = par + imp;
            }
        }
        System.out.println("A somatória dos números ímpares é: " +par);
    }
}
}
