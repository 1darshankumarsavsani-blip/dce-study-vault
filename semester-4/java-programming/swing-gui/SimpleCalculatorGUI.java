package semester4.gui;

import javax.swing.*;

public class SimpleCalculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("DCE Calculator");
        JTextField num1 = new JTextField();
        num1.setBounds(50, 50, 100, 30);
        JTextField num2 = new JTextField();
        num2.setBounds(50, 100, 100, 30);
        JButton btn = new JButton("Add");
        btn.setBounds(50, 150, 100, 30);
        JLabel result = new JLabel("Result: ");
        result.setBounds(50, 200, 150, 30);

        btn.addActionListener(e -> {
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());
            result.setText("Result: " + (a + b));
        });

        frame.add(num1); frame.add(num2); frame.add(btn); frame.add(result);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
