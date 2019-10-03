import javafx.scene.shape.Circle;
import org.w3c.dom.css.Rect;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;
import javax.swing.JComponent;
public class TrafficLightComponent extends JComponent{
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        Rectangle frame = new Rectangle(150, 100, 50, 150);
        g2.draw(frame);
        g2.setColor(Color.green);
        g2.fillOval(160, 210, 30, 30);
        g2.setColor(Color.yellow);
        g2.fillOval(160, 160, 30, 30);
        g2.setColor(Color.red);
        g2.fillOval(160, 110, 30, 30);

    }
}
