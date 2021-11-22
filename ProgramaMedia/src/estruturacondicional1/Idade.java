package estruturacondicional1;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
       Scanner t = new Scanner(System.in);
       System.out.println("Em que ano você nasceu?");
       int nasc = t.nextInt();
       int i = 2021-nasc;

       System.out.println("Sua idade é: " +i);

       if (i>=18){
          System.out.println("Você é maior de idade");
       } else {
            System.out.println("Você é menor de idade");
       }
    }
}
