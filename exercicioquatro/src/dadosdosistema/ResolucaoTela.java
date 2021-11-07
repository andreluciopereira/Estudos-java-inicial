package dadosdosistema;

import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit reso = Toolkit.getDefaultToolkit();
        Dimension d = reso.getScreenSize();
        System.out.println("A resolução da tela é: " + d.width + "X" + d.height);
    }
}
