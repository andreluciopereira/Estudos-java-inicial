package Vetor;

import java.util.Arrays;

public class BuscaVet {
    public static void main(String[] args) {

        int vet[] = {3, 7 , 6, 1, 9, 4, 2};
        for (int v : vet){
            System.out.print(v + " ");
        }
        System.out.println("");

        //para fazer busca dentro do vetor
        int pos = Arrays.binarySearch(vet, 1);
        System.out.println("Encontrei o valor na posição " + pos);

    }
}
