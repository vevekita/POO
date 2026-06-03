import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TelaSimples1 {
    public static void main(String[] args){
        JFrame ts1 = new JFrame();
        
        ts1.setTitle("Tela Simples 1");
        ts1.setSize(480, 480);
        ts1.getContentPane().setBackground(Color.RED);
        ts1.setLocationRelativeTo(null);
        ts1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ts1.setVisible(true);
    }
}
