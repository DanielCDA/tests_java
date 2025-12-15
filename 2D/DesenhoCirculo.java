import java.awt.*;
import javax.swing.*;


public class DesenhoCirculo extends JPanel {
    @Override  
    
    protected  void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.blue);
        g2.fillOval(120, 100, 40, 40);
        g2.setColor(Color.black);
        g2.drawLine(100, 100, 100, 140);
        g2.setColor(Color.red);
        g2.fillRoundRect(190, 100, 40, 40, 10, 10);
    }


   public static void main(String[] args) {
       JFrame frame = new JFrame("Desenho de Circulo");
       frame.setSize(400, 400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.add(new DesenhoCirculo());
       frame.setVisible(true);
   }
}
