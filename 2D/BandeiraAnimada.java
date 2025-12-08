import java.awt.*;
import java.awt.geom.AffineTransform;
import javax.swing.*;

public class BandeiraAnimada extends JPanel {
    private double angulo = 0; // ângulo inicial

    public BandeiraAnimada() {
        // Timer que atualiza a cada 50ms (~20 frames por segundo)
        Timer timer = new Timer(50, e -> {
            angulo += Math.toRadians(2); // gira 2 graus por frame
            repaint(); // redesenha o painel
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        Graphics2D g2 = (Graphics2D) g;

        // Guardar estado original
        AffineTransform original = g2.getTransform();

        // Aplicar rotação em torno do centro da bandeira
        AffineTransform rotacao = new AffineTransform();
        rotacao.rotate(angulo, 180, 180); // centro da bandeira em (180, 180)
        g2.setTransform(rotacao);

        // Desenhar bandeira
        g2.setColor(Color.RED);
        g2.fillRect(80, 80, 200, 200);

        g2.setColor(Color.BLACK);
        g2.fillRect(80, 180, 200, 100);

        g2.setColor(Color.YELLOW);
        g2.fillArc(130, 130, 100, 100, -90, 180);

        // Restaurar estado original
        g2.setTransform(original);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bandeira de Angola Animada");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new BandeiraAnimada());
        frame.setVisible(true);
    }
}