import javax.swing.*;

public class OlympicRingsViewer {
    public static void main (String[] args){
        JFrame frame = new JFrame();

        frame.setTitle("Olympic Rings");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        OlympicRingsComponent component = new OlympicRingsComponent();

        frame.add(component);
        frame.setVisible(true);
    }
}
