package br.com.aulagui.view.jframe;

import java.awt.Component;
import javax.swing.JOptionPane;

public class InputDialogGUI {
    public static void main(String[] args){
        String s1 = JOptionPane.showInputDialog(null, "Primeiro Número", "Entrada", JOptionPane.QUESTION_MESSAGE);
        
        String s2 = JOptionPane.showInputDialog(null, "Segundo Número", "Entrada", JOptionPane.QUESTION_MESSAGE);
        
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int sum = n1 + n2;
        
        JOptionPane.showMessageDialog(null, "A soma é: " + sum, "Soma de Dois números", JOptionPane.PLAIN_MESSAGE);
    }
}
