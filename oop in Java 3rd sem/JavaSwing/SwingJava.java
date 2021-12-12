import java.awt.*;
import javax.swing.*;

public class SwingJava {
    public SwingJava()
    {
        JPanel panel1 =new JPanel();
        JFrame frame = new JFrame();
        JButton btn = new JButton("Submit");

        JLabel label = new JLabel("Enter your name: ");
        JTextField field = new JTextField(20);
        panel1.add(label);
        panel1.add(field);
        panel1.add(btn);
        panel1.setLayout(new FlowLayout());
        


        JPanel panel2 = new JPanel();
        JCheckBox box1 = new JCheckBox("Java");
        JCheckBox box2 = new JCheckBox("C");
        JCheckBox box3 = new JCheckBox("C++");
        ButtonGroup bg = new ButtonGroup();

        bg.add(box1);
        bg.add(box2);
        bg.add(box3);

        panel2.add(box1);
        panel2.add(box2);
        panel2.add(box3);
        panel2.setLayout(new FlowLayout());
        
        

        //

        frame.add(panel1);
        frame.add(panel2);

        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new SwingJava();
    }
}
