package br.ufjf.dcc;

import javax.swing.JOptionPane;

public class Aula01Exm02b {
    public static void main(String[] args) {
        String numero1;
        String numero2;
        
        numero1 = JOptionPane.showInputDialog("Digite o primeiro número");
        numero2 = JOptionPane.showInputDialog("Digite o segundo número");
       
        Integer n1 = null;
        Integer n2 = null;
        try {
            n1 = Integer.parseInt(numero1);
            n2 = Integer.parseInt(numero2);
            JOptionPane.showMessageDialog(null, "O resultado é : " + (n1+n2), "Resultado", JOptionPane.PLAIN_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Você deve entrar com um número inteiro válido! "+e.getLocalizedMessage(), "Entrada inválida!", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
}
