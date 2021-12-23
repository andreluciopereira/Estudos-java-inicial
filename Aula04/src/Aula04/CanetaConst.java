package Aula04;

public class CanetaConst {
    public static void main(String[] args) {
        Caneta c2 = new Caneta("Nic", "Amarelo", 0.4f);
        c2.status();

        System.out.println("-----------------------------");

        Caneta c3 = new Caneta("Construtor", "Qualquer", 1.5f);
        c3.status();
    }
}
