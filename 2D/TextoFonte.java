import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TextoFonte extends JPanel {
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setFont(new Font("Serif", Font.BOLD, 15));
        g2.drawString("Daniel es lindo",100,80);

    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Texto com Fonte Personalizada");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new TextoFonte());
        frame.setVisible(true);
    }
}
