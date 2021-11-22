package estruturacondicional1;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        // write your code here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pemeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.println("Segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) / 2;

        System.out.println("Sua média foi " + m);
        if (m > 9) {
            System.out.println("Parabens, você foi aprovado");
        } else {
            System.out.println("Você não foi aprovado. Estude mais.");
        }
    }
}
