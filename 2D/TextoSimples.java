
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TextoSimples extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.green);
        g2.drawString("Texto Simples em Java 2D", 100, 75);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Texto Simples");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new TextoSimples());
        frame.setVisible(true);
    }
}
