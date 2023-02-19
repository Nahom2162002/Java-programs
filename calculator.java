import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator {
    public static void main(String [] args) {
        int sum;
        int difference;
        int product;
        int quotient;
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel number1 = new JLabel("number1");
        JLabel number2 = new JLabel("number2");
        JLabel result = new JLabel("Result");

        JTextField firstnum = new JTextField(System.in);
        JTextField secondnum = new JTextField(System.in);
        JTextField resultnum = new JTextField();

        JButton add = new JButton("Add");
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum = add(Integer.parseInt(firstnum.getText()), Integer.parseInt(secondnum.getText()));
                resultnum.setText(String.toString(sum));
            }
        });

        JButton subtract = new JButton("Subtract");
        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                difference = subtract(Integer.parseInt(firstnum.getText()), Integer.parseInt(secondnum.getText()));
                resultnum.setText(String.toString(difference));
            }
        });

        JButton multiply = new JButton("Multiply");
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product = multiply(Integer.parseInt(firstnum.getText()), Integer.parseInt(secondnum.getText()));
                resultnum.setText(String.toString(product));
            }
        });

        JButton divide = new JButton("Divide");
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quotient = divide(Integer.parseInt(firstnum.getText()), Integer.parseInt(secondnum.getText()));
                resultnum.setText(String.toString(quotient));
            }
        });

        JButton close = new JButton("Close");
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
