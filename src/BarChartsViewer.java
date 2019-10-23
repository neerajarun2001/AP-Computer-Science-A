import javax.swing.*;
public class BarChartsViewer {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("BarCharts");
        frame.setSize(750, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BarChartsComponent component = new BarChartsComponent();
        frame.add(component);
        frame.setVisible(true);
    }


}
