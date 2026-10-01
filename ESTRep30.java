import javax.swing.JOptionPane;
//Receba a data de nascimento e atual em ano, mês e dia.
//Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
public class ESTRep30 {
    public static boolean bissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        // %4 == 0 - div/4 com resto 0 é ano bissexto
        // %100 == 0 - div/100 com resto 0 (final de século ñ é ano bissexto)
        // %400 == 0 - div/400 é ano bissexto 
    }
    
    public static int diames(int mes, int ano) {
        switch (mes) {
            case 2: //fevereiro
                return bissexto(ano) ? 29 : 28;
            case 4: case 6: case 9: case 11: //meses com 30 dias
                return 30;
            default:
                return 31; //meses com 31 dias
        }
    }
                        
    public static void main (String args [] ) {
        String nasc = JOptionPane.showInputDialog("Digite a data de nascimento em (DD/MM/AAAA): ");
        String atual = JOptionPane.showInputDialog("Digite a data atual em (DD/MM/AAAA): ");
        
        if (nasc == null || atual == null) {
            return;
        }
        
        int dNasc = Integer.parseInt(nasc.substring(0, 2)); //seleciona o dia nasc do string
        int mNasc = Integer.parseInt(nasc.substring(3, 5)); //seleciona o mes nasc do string
        int aNasc = Integer.parseInt(nasc.substring(6, 10)); //seleciona o ano nasc do string
        
        int dAtual = Integer.parseInt(atual.substring(0, 2)); //seleciona o dia atual do string
        int mAtual = Integer.parseInt(atual.substring(3, 5)); //seleciona o mes atual do string
        int aAtual = Integer.parseInt(atual.substring(6, 10)); //seleciona o ano atual do string
        
        int anos = 0;
        int meses = 0;
        int dias = 0;
        
        int tempAno = aNasc;
        int tempMes = mNasc;
        int tempDia = dNasc;
        
        while (tempAno < aAtual || (tempAno == aAtual && (tempMes < mAtual || (tempMes == mAtual && tempDia <= dAtual)))) {
            int proximoAno = tempAno +1;
            boolean ultrapassou = false;
            
            if (proximoAno > aAtual) {
                ultrapassou = true;
            } else if (proximoAno == aAtual) {
                if (tempMes > mAtual) {
                    ultrapassou = true;
                } else if (tempMes == mAtual && tempDia > dAtual) {
                    ultrapassou = true;
                }
            }
            if (ultrapassou) {
                break;
            }
            tempAno++;
            anos++;
        }
        while (tempAno < aAtual || (tempAno == aAtual && tempMes < mAtual)) {
            int proximoMes = tempMes +1;
            int proximoAnoMes = tempAno;
            if (proximoMes > 12) {
                proximoMes = 1;
                proximoAnoMes++;
            }
            boolean ultrapassouMes = false;
            if (proximoAnoMes > aAtual) {
                ultrapassouMes = true;
            } else if (proximoAnoMes == aAtual && proximoMes > mAtual) {
                ultrapassouMes = true;
            } else if (proximoAnoMes == aAtual && proximoMes == mAtual && tempDia > dAtual) {
                ultrapassouMes = true;
            }

            if (ultrapassouMes) {
                break;
            }

            tempMes = proximoMes;
            tempAno = proximoAnoMes;
            meses++;
        }

        // Laço de repetição para calcular os dias
        while (tempAno != aAtual || tempMes != mAtual || tempDia != dAtual) {
            int diasNoMesAtual = diames(tempMes, tempAno);
            tempDia++;
            dias++;

            if (tempDia > diasNoMesAtual) {
                tempDia = 1;
                tempMes++;
                if (tempMes > 12) {
                    tempMes = 1;
                    tempAno++;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Idade exata:\n" + anos + " anos, " + meses + " meses e " + dias + " dias.");
    }
}
