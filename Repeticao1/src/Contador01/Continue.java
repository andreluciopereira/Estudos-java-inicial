package Contador01;

public class Continue {
    public static void main (String[] args) {
        int cc = 0;

        while (cc < 10) {
            cc++;
            if (cc == 5 || cc == 7) {
                //continue faz ele quebrar o laço de repetição quando encontrar a condição.

                continue;
            }
                        System.out.println("Cambalhota " +cc);

        }
    }
}