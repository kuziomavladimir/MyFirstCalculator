package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalcFrame
{
    private JFrame frame1;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label1;
    private JTextField field1;
    private JTextField field2;
    private JTextField fieldRez;
    private JButton buttonPlus;
    private JButton buttonMin;
    private JButton buttonMul;
    private JButton buttonDiv;
    private JButton buttonPercent;

    public CalcFrame()
    {
        frame1 = new JFrame("Calculator");
        frame1.setBounds(700, 150, 1280, 540);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("Введите значения: ");

        field1 = new JTextField(15);
        field2 = new JTextField(15);
        fieldRez = new JTextField(15);

        panel1 = new JPanel();
        panel1.setBackground(Color.GRAY);
        panel1.add(label1);
        panel1.add(field1);
        panel1.add(field2);
        panel1.add(fieldRez);

        buttonPlus = new JButton("+");
        buttonMin = new JButton("-");
        buttonMul = new JButton("*");
        buttonDiv = new JButton("/");
        buttonPercent = new JButton("%");

        buttonPlus.addActionListener(new PlusButtonListener());
        buttonMin.addActionListener(new MinusButtonListener());
        buttonMul.addActionListener(new MulButtonListener());
        buttonDiv.addActionListener(new DivButtonListener());
        buttonPercent.addActionListener(new PercentButtonListener());


        panel2 = new JPanel();
        panel2.add(buttonPlus);
        panel2.add(buttonMin);
        panel2.add(buttonMul);
        panel2.add(buttonDiv);
        panel2.add(buttonPercent);

        frame1.add(BorderLayout.NORTH, panel1);
        frame1.add(BorderLayout.CENTER, panel2);
        frame1.setVisible(true);
    }

    class PlusButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            label1.setText("Введите значения: ");
            try {
                Double val1 = Double.parseDouble(field1.getText());
                Double val2 = Double.parseDouble(field2.getText());
                fieldRez.setText(Double.toString((val1 + val2)));
            }catch (Exception ex)
            {
                label1.setText("НЕКОРРЕКТНЫЕ ЗНАЧЕНИЯ!");
            }
        }
    }
    class MinusButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            label1.setText("Введите значения: ");
            try {
                Double val1 = Double.parseDouble(field1.getText());
                Double val2 = Double.parseDouble(field2.getText());
                fieldRez.setText(Double.toString((val1 - val2)));
            }catch (Exception ex)
            {
                label1.setText("НЕКОРРЕКТНЫЕ ЗНАЧЕНИЯ!");
            }
        }
    }
    class MulButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            label1.setText("Введите значения: ");
            try {
                Double val1 = Double.parseDouble(field1.getText());
                Double val2 = Double.parseDouble(field2.getText());
                fieldRez.setText(Double.toString((val1 * val2)));
            }catch (Exception ex)
            {
                label1.setText("НЕКОРРЕКТНЫЕ ЗНАЧЕНИЯ!");
            }
        }
    }
    class DivButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            label1.setText("Введите значения: ");
            try {
                Double val1 = Double.parseDouble(field1.getText());
                Double val2 = Double.parseDouble(field2.getText());
                fieldRez.setText(Double.toString((val1 / val2)));
            }catch (Exception ex)
            {
                label1.setText("НЕКОРРЕКТНЫЕ ЗНАЧЕНИЯ!");
            }
        }
    }
    class PercentButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            label1.setText("Введите значения: ");
            try {
                Double val1 = Double.parseDouble(field1.getText());
                Double val2 = Double.parseDouble(field2.getText());
//                Double val3 = ((val1 / 100) * val2);
                fieldRez.setText(Double.toString(((val1 / 100) * val2)));
            }catch (Exception ex)
            {
                label1.setText("НЕКОРРЕКТНЫЕ ЗНАЧЕНИЯ!");
            }
        }
    }
}
