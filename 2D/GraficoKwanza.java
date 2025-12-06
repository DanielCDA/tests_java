import java.awt.*;
import java.awt.geom.AffineTransform;
import javax.swing.*;

public class GraficoKwanza extends JPanel {
    
    int[] valores = {5000, 12000, 8000, 15000}; // valores em Kz

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        int x = 50;
        for (int valor : valores) {
            AffineTransform at = new AffineTransform();
            at.translate(x, 200); // mover barra para posição
            at.scale(1, valor / 5000.0); // escalar altura proporcional ao valor

            g2.setTransform(at);
            g2.setColor(Color.BLUE);
            g2.fillRect(0, -40, 40, 40); // barra escalada
            g2.setColor(Color.BLACK);
            g2.drawString(valor + " Kz", 0, 20);

            x += 60;
        }
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Gráfico em Kwanza");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(new GraficoKwanza());
        frame.setVisible(true);
    }
}