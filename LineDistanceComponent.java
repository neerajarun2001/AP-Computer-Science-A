import javafx.scene.shape.Circle;
import org.w3c.dom.css.Rect;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.*;
import javax.swing.JComponent;
public class LineDistanceComponent extends JComponent{
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(Color.red);
        g2.drawLine(100, 100, 200, 200);
        g2.drawOval(100, 100, 2, 2);
        g2.drawOval(150, 150, 2, 2);
        g2.drawOval(250, 50, 2, 2);

        Line2D.Double line = new Line2D.Double(100, 100, 200, 200);
        Point2D.Double point1 = new Point2D.Double(100, 100);
        Point2D.Double point2 = new Point2D.Double(150, 150);
        Point2D.Double point3 = new Point2D.Double(250, 50);

        double distance1 = line.ptSegDist(point1);
        double distance2 = line.ptSegDist(point2);
        double distance3 = line.ptSegDist(point3);

        g2.drawString("Distance: " + distance1, (int)point1.getX(), (int)point1.getY());
        g2.drawString("Distance: " + distance2, (int)point2.getX(), (int)point2.getY());
        g2.drawString("Distance: " + distance3, (int)point3.getX(), (int)point3.getY());

    }
}
