package br.com.xti.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.round;

public class TemperatureConverter extends JFrame {

    private JButton buttonConvert;
    private JPanel MainPanel;
    private JTextField textFahrenheit;
    private JTextField textCelsius;

    public TemperatureConverter(){
        super("Temperature Converter V1");

        setContentPane(MainPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,170);
        setVisible(true);
        buttonConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double fahrenheit = Double.parseDouble(textFahrenheit.getText());
                    double celsius = (fahrenheit - 32) / 1.8;
                    textCelsius.setText(round(celsius) + "ºC");
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Something went wrong. Please try again.");
                }
            }
        });
    }

    public static void main(String[] args) {
        new TemperatureConverter();
    }
}
