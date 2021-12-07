package funcao01;

import java.util.Scanner;

public class Funcao001 {

    public static void main(String[] args) {

        int x = 0;
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        x = tec.nextInt();


        Fatorial f = new Fatorial();

        f.setValor(x);
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
    }
}
