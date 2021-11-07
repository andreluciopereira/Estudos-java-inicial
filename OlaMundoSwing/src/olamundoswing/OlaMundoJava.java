package olamundoswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundoJava {
    private JPanel panel1;
    private JButton Botao;
    private JLabel lblabel;
    //private -> encapsulamento para tornar privado

    public OlaMundoJava() {
        Botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblabel.setText("Olá, Mundo!");
            }
        });
    }private void createUIComponents() {
        // TODO: place custom component creation code here

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("OlaMundoJava");
        frame.setContentPane(new OlaMundoJava().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
