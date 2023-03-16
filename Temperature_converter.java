import javax.swing.*;
import java.awt.event.*;

public class Temperature_converter {
    public static void main(String [] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 500);

        JLabel f = new JLabel("Farenheit");
        f.setBounds(100, 2, 70, 40);
        frame.add(f);
        JTextField fa = new JTextField();
        fa.setBounds(100, 50, 70, 20);
        frame.add(fa);
        JLabel c = new JLabel("Celsius");
        c.setBounds(200, 2, 70, 40);
        frame.add(c);
        JTextField ce = new JTextField();
        ce.setBounds(200, 50, 70, 20);
        frame.add(ce);
        JButton convert = new JButton("Convert");
        convert.setBounds(300, 50, 90, 20);

        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fa.getText().equals("") && !ce.getText().equals("")) {
                    final double temp = Double.parseDouble(ce.getText());
                    fa.setText(String.valueOf(Tofarenheit(temp)));
                }
                else if (!fa.getText().equals("") && ce.getText().equals("")) {
                    final double temp = Double.parseDouble(fa.getText());
                    ce.setText(String.valueOf(Tocelsius(temp)));
                }
            }
        });
        frame.add(convert);
    }

    public static double Tofarenheit(double celsius) {
        double x = 5.0/9.0;
        return (celsius * x) + 32;
    }

    public static double Tocelsius(double farenheit) {
        double x = 5.0/9.0;
        return (farenheit - 32) * x;
    }
}