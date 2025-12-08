import java.awt.*;
import java.awt.geom.AffineTransform;
import javax.swing.*;

public class BandeiraAnimadaCombo extends JPanel {
    private double angulo = 0;      // ângulo de rotação
    private double escala = 1.0;    // fator de escala
    private boolean aumentando = true; // controla se está aumentando ou diminuindo

    public BandeiraAnimadaCombo() {
        // Timer que atualiza a cada 50ms
        Timer timer = new Timer(50, e -> {
            // Atualiza rotação
            angulo += Math.toRadians(2);

            // Atualiza escala (efeito pulsante)
            if (aumentando) {
                escala += 0.02;
                if (escala >= 1.5) aumentando = false;
            } else {
                escala -= 0.02;
                if (escala <= 0.8) aumentando = true;
            }

            repaint(); // redesenha
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        Graphics2D g2 = (Graphics2D) g;

        // Guardar estado original
        AffineTransform original = g2.getTransform();

        // Combinar rotação + escala em torno do centro da janela
        AffineTransform transform = new AffineTransform();
        transform.rotate(angulo, getWidth() / 2.0, getHeight() / 2.0);
        transform.scale(escala, escala);
        g2.setTransform(transform);

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
        JFrame frame = new JFrame("Bandeira de Angola Animada (Rotação + Escala)");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new BandeiraAnimadaCombo());
        frame.setVisible(true);
    }
}