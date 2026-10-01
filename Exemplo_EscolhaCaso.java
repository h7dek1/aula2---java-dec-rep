//Receba o código correspondente ao cargo de um funcionário e seu salário atual
//e mostre o cargo,  o valor do aumento e seu salário. Os cargos estão na tabela. 
//1 - escrituario 50%
//2 - secretario 35%
//3 - caixa 20%
//4 - gerente 10%
//out - "não há cargo" -
import javax.swing.JOptionPane;
public class Exemplo_EscolhaCaso {
    public static void main(String[] args) {
    int codigo; 
    double salario, aumento = 0;
    String cargo;
    codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do cargo: "));
    salario = Double.parseDouble(JOptionPane.showInputDialog ("Informe o salário atual: "));
    switch(codigo) 
        {
           case 1: cargo = "Escriturário";
             aumento = (salario * 0.50); 
             salario = salario + aumento; 
             System.out.println("O cargo " +cargo+ " terá um aumento de " +aumento+ " reais e seu novo salário será: " +salario+ " reais");
             break;
           case 2: cargo = "Secretário"; 
             aumento = (salario * 0.35); 
             salario = salario + aumento; 
             System.out.println("O cargo " +cargo+ " terá um aumento de " +aumento+ " reais e seu novo salário será: " +salario+ " reais");
             break;
           case 3: cargo = "Caixa";
             aumento = (salario * 0.20); 
             salario = salario + aumento; 
             System.out.println("O cargo " +cargo+ " terá um aumento de " +aumento+ " reais e seu novo salário será: " +salario+ " reais"); 
             break;
           case 4: cargo = "Gerente";
             aumento = (salario * 0.10); 
             salario = salario + aumento; 
             System.out.println("O cargo " +cargo+ " terá um aumento de " +aumento+ " reais e seu novo salário será: " +salario+ " reais"); 
             break;
           default: cargo = "Não há cargo";System.out.println(cargo); 
             break;
   }
 }
}