package soma;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSoma {
    private JPanel panel1;
    private JTextField txtN1;
    private JTextField txtN2;
    private JButton btnsoma;
    private JLabel lblResultado;

    public TelaSoma() {
        btnsoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                int s = n1 + n2;
                lblResultado.setText(Integer.toString(s));

            }
        });
    }private void createUIComponents() {
        // TODO: place custom component creation code here

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TelaSoma");
        frame.setContentPane(new TelaSoma().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

