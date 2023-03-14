import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator {
    public static void main(String [] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLayout(null);
        
        JLabel number1 = new JLabel("number1");
        number1.setBounds(100, 50, 70, 40);
        JLabel number2 = new JLabel("number2");
        number2.setBounds(200, 50, 70, 40);
        JLabel result = new JLabel("Result");
        result.setBounds(300, 50, 70, 40);
        frame.add(number1);
        frame.add(number2);
        frame.add(result);

        JTextField firstnum = new JTextField();
        firstnum.setBounds(100, 80, 70, 20);
        JTextField secondnum = new JTextField();
        secondnum.setBounds(200, 80,70, 20);
        JTextField resultnum = new JTextField();
        resultnum.setBounds(300, 80, 70,20);
        frame.add(firstnum);
        frame.add(secondnum);
        frame.add(resultnum);

        JButton add = new JButton("Add");
        add.setBounds(100, 2, 70, 40);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final int sum = add(Integer.parseInt(firstnum.getText()), Integer.parseInt(secondnum.getText()));
                resultnum.setText(String.valueOf(sum));
            }
        });
        frame.add(add);

        JButton subtract = new JButton("Subtract");
        subtract.setBounds(200, 2, 90, 40);
        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final int difference = subtract(Integer.parseInt(firstnum.getText()), Integer.parseInt(secondnum.getText()));
                resultnum.setText(String.valueOf(difference));
            }
        });
        frame.add(subtract);

        JButton multiply = new JButton("Multiply");
        multiply.setBounds(300, 2, 80, 40);
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final int product = multiply(Integer.parseInt(firstnum.getText()), Integer.parseInt(secondnum.getText()));
                resultnum.setText(String.valueOf(product));
            }
        });
        frame.add(multiply);

        JButton divide = new JButton("Divide");
        divide.setBounds(400, 2, 80, 40);
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final int quotient = divide(Integer.parseInt(firstnum.getText()), Integer.parseInt(secondnum.getText()));
                resultnum.setText(String.valueOf(quotient));
            }
        });
        frame.add(divide);

        JButton close = new JButton("Close");
        close.setBounds(500, 2, 70, 40);
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        frame.add(close);
    }    

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }
}
