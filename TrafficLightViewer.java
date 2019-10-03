import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JFrame;

public class TrafficLightViewer {
    public static void main(String[] args){
        JFrame frame = new JFrame("Traffic Light");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        TrafficLightComponent component = new TrafficLightComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
