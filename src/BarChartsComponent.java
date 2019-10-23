import javax.swing.*;
import java.awt.*;
public class BarChartsComponent extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        BarCharts test = new BarCharts();
        test.drawAxes(g2);
        test.labelAxes(g2);
        test.drawBars(g2);
    }

}
