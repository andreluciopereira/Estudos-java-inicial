package FuncMetodos;

public class SomaInt {

    static int soma (int a, int b) {
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Começou o programa");
        int sm = soma(5,3);
        System.out.println("A soma é: " + sm);

    }
}
