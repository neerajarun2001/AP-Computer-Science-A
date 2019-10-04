import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JFrame;

public class LineDistanceViewer {
    public static void main(String[] args){
        JFrame frame = new JFrame("LineDistanceViewer");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        LineDistanceComponent component = new LineDistanceComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
