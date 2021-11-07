package imagem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Relogio {
    private JPanel panel1;
    private JButton btnbotao;
    private JLabel lbldata;
    private JLabel imagem;

    public Relogio() {
        btnbotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Date relogio = new Date();
              lbldata.setText(relogio.toString());
            }
        });
    }private void createUIComponents() {
        // TODO: place custom component creation code here

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Relogio");
        frame.setContentPane(new Relogio().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}