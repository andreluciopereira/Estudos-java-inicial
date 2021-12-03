package Vetor;

public class Vetor01 {
    public static void main(String[] args) {

        /*para declarar o vetor pode utilizar o cochetes "[]" antes ou após a variavel int []n =
         o valor do vetor pode ser atribuido da seguinte forma:
         int n[] = new int[4]; (depois fazer as atribuições para cada um n[0] = 1
                                                                         n[1] = 2...
         ou pode declarar ja atribuindo o valor:
            int n[] = {3,2,8,7,5,4}
         */
       // int n[] = new int[4];
        int n[] = {3,2,2,8,7,4};
        System.out.println("Total de casas de N é: " + n.length);

        for (int c = 0; c <= n.length - 1; c++){
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
    }
}
