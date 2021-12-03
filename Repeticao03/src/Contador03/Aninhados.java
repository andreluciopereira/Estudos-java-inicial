package Contador03;

public class Aninhados {
    public static void main(String[] args) {

        for (int i = 0; i <=3; i++){
            System.out.println("O valor de I é: " +i);
            for (int j = 0; j<=2; j+=2){
                System.out.println("O valor de J é: " +j);
                if (i < 4){
                    System.out.println("Estou na repetição do J");
                }
            }
        }
    }
}
