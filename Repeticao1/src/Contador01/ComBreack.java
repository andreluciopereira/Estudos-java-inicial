package Contador01;

public class ComBreack {
    public static void main(String[] args) {
        int cc = 0;

        while (cc < 10) {
            cc++;

            if (cc == 2 || cc == 3 || cc == 4) {
                System.out.println("interrompeu utilizando comando 'continue' no contador " + cc);
                continue;
            }
            if (cc == 7) {
                //comando break interrompe o laço de repetição.
                System.out.println("Interrompido por 'break' no contador " + cc);
                break;
            }
            System.out.println("Cambalhota " +cc);

        }
    }
}