import javafx.scene.shape.Ellipse;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Hello {
    public Hello(){

    }
    public void drawH(Graphics2D g2){

        Line2D.Double h1 = new Line2D.Double(10, 10, 10, 110);
        Line2D.Double h2 = new Line2D.Double(10, 60, 60, 60);
        Line2D.Double h3 = new Line2D.Double(60, 10, 60, 110);

        g2.draw(h1);
        g2.draw(h2);
        g2.draw(h3);

    }
    public void drawE(Graphics2D g2){

        Line2D.Double e1 = new Line2D.Double(70, 10, 70, 110);
        Line2D.Double e2 = new Line2D.Double(70, 10, 95, 10);
        Line2D.Double e3 = new Line2D.Double(70, 60, 95, 60);
        Line2D.Double e4 = new Line2D.Double(70, 110, 95, 110);

        g2.draw(e1);
        g2.draw(e2);
        g2.draw(e3);
        g2.draw(e4);

    }
    public void drawL(Graphics2D g2){

        Line2D.Double l1 = new Line2D.Double(110, 10, 110, 110);
        Line2D.Double l2 = new Line2D.Double(110, 110, 135, 110);

        g2.draw(l1);
        g2.draw(l2);

    }
    public void drawLL(Graphics2D g2){

        Line2D.Double l1 = new Line2D.Double(145, 10, 145, 110);
        Line2D.Double l2 = new Line2D.Double(145, 110, 170, 110);

        g2.draw(l1);
        g2.draw(l2);

    }
    public void drawO(Graphics2D g2){

        Ellipse2D.Double o1 = new Ellipse2D.Double(180, 10, 100, 100);

        g2.draw(o1);

    }
}

