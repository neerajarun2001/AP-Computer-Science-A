import javax.swing.*;

public class HelloViewer {
    public static void main(String[] args){
        JFrame frame = new JFrame();

        frame.setTitle("Hello");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        HelloComponent component = new HelloComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
