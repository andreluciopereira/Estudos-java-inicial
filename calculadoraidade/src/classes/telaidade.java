package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaidade {
    private JSpinner txtAN;
    private JButton btnCalc;
    private JLabel lblIdade;
    private JPanel panel1;

    public telaidade() {
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int an = Integer.parseInt(txtAN.getValue().toString());
                int id = 2021 - an;
                lblIdade.setText(Integer.toString(id));
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("telaidade");
        frame.setContentPane(new telaidade().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
