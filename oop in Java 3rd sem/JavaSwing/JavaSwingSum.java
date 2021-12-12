import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaSwingSum {

    public JavaSwingSum()
    {
        JFrame frame = new JFrame();

        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Enter first number: ");
        JTextField field1 = new JTextField(20);
        panel1.add(label1);
        panel1.add(field1);
        panel1.setLayout(new FlowLayout());

        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("Enter second number: ");
        JTextField field2 = new JTextField(20);
        JButton btn1 = new JButton("Sum");


        panel2.add(label2);
        panel2.add(field2);
        // panel2.add(btn1);
        panel2.setLayout(new FlowLayout());
        
        JPanel panel3 = new JPanel();
        panel3.add(btn1);
        panel3.setLayout(new FlowLayout());


        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

        btn1.addActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int a = Integer.parseInt(field1.getText());
                int b = Integer.parseInt(field2.getText());
                int result = a+b;
                System.out.print(result);
            }
              
        });




        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new JavaSwingSum();
    }

}
