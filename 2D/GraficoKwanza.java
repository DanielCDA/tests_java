import java.awt.*;
import javax.swing.*;

public class GraficoKwanza extends JPanel {
    int[] valores = {5000, 12000, 8000, 15000}; // valores fictícios em Kz

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        int x = 50;
        for (int valor : valores) {
            g2.setColor(Color.BLUE);
            g2.fillRect(x, 200 - (valor / 100), 40, valor / 100);
            g2.setColor(Color.BLACK);
            g2.drawString(valor + " Kz", x, 220);
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