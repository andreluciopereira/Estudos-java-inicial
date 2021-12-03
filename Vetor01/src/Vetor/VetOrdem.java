package Vetor;

import java.util.Arrays;

public class VetOrdem {
    public static void main(String[] args) {

        double v[] = {3.5, 2.75, 9, -4.5};

        //para ordenar o vetor utiliza a declaração Arrays.sort(vetor)

        Arrays.sort(v);
        for (double valor : v) {
            System.out.println(valor);
        }
    }
}
