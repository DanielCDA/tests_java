
import java.awt.*;
import javax.swing.*;

public class Bandeira extends JPanel {
    @Override
    
    protected void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        // Desenhar a bandeira da Angola
        g2.setColor(Color.red);
        g2.fillRect(80, 80, 200, 200);
        g2.setColor(Color.black);
        g2.fillRect(80, 180, 200, 100);

        g2.setColor(Color.yellow);
        g2.fillArc(130, 130, 100, 100, -90, 180);
         
       
       
     }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bandeira da Angola");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Bandeira());
        frame.setVisible(true);
    }
}
