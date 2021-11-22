package estcondicional2;

import java.util.Scanner;

public class Votacao {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento: ");

        int nasc = tec.nextInt();
        int i = 2021 - nasc;

        System.out.println("Sua idade é: " + i);

        if (i < 16) {
            System.out.println("Não vota");
        } else {
            if ((i >= 16 && i < 18) || (i > 70)) {
                System.out.println("Votação opcional");
            } else {
                System.out.println("Obrigatorio votar");
            }
        }
    }
}
