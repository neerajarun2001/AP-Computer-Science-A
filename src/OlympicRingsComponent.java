import javax.swing.*;
import java.awt.*;

public class OlympicRingsComponent extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        OlympicRings test = new OlympicRings();

        test.drawRing(g2, Color.BLUE, 20, 20);
        test.drawRing(g2, Color.YELLOW, 65, 65);
        test.drawRing(g2, Color.BLACK, 100, 20);
        test.drawRing(g2, Color.GREEN, 123, 65);
        test.drawRing(g2, Color.RED, 180, 20);

    }
}
