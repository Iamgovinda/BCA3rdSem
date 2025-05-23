import java.awt.event.*;
import javax.swing.*;


class Test extends JFrame implements ActionListener {

    JButton jb1;
    JTextField jt1, jt2,jt3;
    JLabel lbl;

    Test() {

        jt1 = new JTextField();
        jt1.setBounds(90, 50, 150, 30);
        add(jt1);

        jt2 = new JTextField();
        jt2.setBounds(90, 80, 150, 30);
        add(jt2);

        jt3 = new JTextField();
        jt3.setBounds(90, 110, 150, 30);
        add(jt3);

        lbl = new JLabel("Result :");
        lbl.setBounds(90, 140, 150, 30);
        add(lbl);

        jb1 = new JButton("+");
        jb1.setBounds(90, 200, 100, 30);
        add(jb1);

        jb1.addActionListener(this);

        setLayout(null);
        setSize(600, 400);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(jt1.getText());
        int b = Integer.parseInt(jt2.getText());
        int c = Integer.parseInt(jt3.getText());
        int d = 0;

        if (e.getSource().equals(jb1)) {
            d = a + b + c;
            lbl.setText(String.valueOf(d));
        }
    }

    public static void main(String args[]) {
        Test t = new Test();
    }
}