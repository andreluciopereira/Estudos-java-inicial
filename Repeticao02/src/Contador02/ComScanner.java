package Contador02;

import java.util.Scanner;

public class ComScanner {
    public static void main(String[] args) {

        int n, s =0;
        String resp;
        Scanner tec = new Scanner(System.in);

        do {
            System.out.print("Digite um numero: ");
            n = tec.nextInt();
            s += n; //s = s + n;
            System.out.print("Quero continuar? [S/N] ");

            resp = tec.next();
        } while (resp.equals("S"));

        System.out.println("A soma de todos os valores é " + s);
    }
}
