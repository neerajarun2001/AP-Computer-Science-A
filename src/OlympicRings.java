import java.awt.*;
import java.awt.geom.Ellipse2D;

public class OlympicRings {
    public OlympicRings(){

    }
    public void drawRing(Graphics2D g2, Color color, int x, int y){
        Ellipse2D.Double ring = new Ellipse2D.Double(x, y, 75, 75);

        g2.setColor(color);

        g2.draw(ring);
    }
}

