import javax.swing.*;
import java.awt.*;
public class HelloComponent extends JComponent {
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        Hello test = new Hello();

        test.drawH(g2);
        test.drawE(g2);
        test.drawL(g2);
        test.drawLL(g2);
        test.drawO(g2);
    }
}
