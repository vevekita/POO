package br.com.aulagui.view.jframe;

import java.awt.Color;
import javax.swing.JFrame;

public class TelaSimples4 extends JFrame{
    TelaSimples4(String titulo){
        super(titulo);
        setSize(640, 480);
        getContentPane().setBackground(Color.red);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
