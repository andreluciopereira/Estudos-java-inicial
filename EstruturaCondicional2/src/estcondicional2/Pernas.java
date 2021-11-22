package estcondicional2;

import java.util.Scanner;

public class Pernas {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Digite quantas pernas possui o ser: ");

        int perna = tec.nextInt();
        String tipo;

        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
            case  6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println("Este ser é um(a) " + tipo);
    }
}
