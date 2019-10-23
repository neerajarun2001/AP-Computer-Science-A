import java.awt.geom.Line2D;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class BarCharts {
    public BarCharts(){

    }
    public void drawAxes(Graphics2D g2){
        Line2D.Double axis1 = new Line2D.Double(150, 50, 150, 250);
        Line2D.Double axis2 = new Line2D.Double(150, 250, 700, 250);

        g2.draw(axis1);
        g2.draw(axis2);
    }
    public void labelAxes(Graphics2D g2){
        g2.drawString("Bridge Name", 10, 25);
        g2.drawString("Longest Span(ft)", 75, 275);
        g2.drawString("Golden Gate", 10, 75);
        g2.drawString("Brooklyn", 10, 125);
        g2.drawString("Delaware Memorial", 10, 175);
        g2.drawString("Mackinac", 10, 225);
    }
    public void drawBars(Graphics2D g2){
        Rectangle2D.Double goldenGate = new Rectangle2D.Double(150, 50, 420, 40);
        Rectangle2D.Double brooklyn = new Rectangle2D.Double(150, 100, 159.5, 40);
        Rectangle2D.Double delawareMemorial = new Rectangle2D.Double(150, 150, 215, 40);
        Rectangle2D.Double mackinac = new Rectangle2D.Double(150, 200, 380, 40);

        g2.draw(goldenGate);
        g2.draw(brooklyn);
        g2.draw(delawareMemorial);
        g2.draw(mackinac);

    }

}

