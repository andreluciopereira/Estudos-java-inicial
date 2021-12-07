package funcao01;

public class Fatorial {

    // criando atributos.
    private int num = 0;
    private int fat = 1;
    private String formula = "";

    // criar metodos
    public void  setValor(int n) {
        num = n;
        int f = 1;
        String s = "";

        //cria um laço de repetição para fazer a contagem
        for (int c = n; c > 1; c--) {
            f *= c;
            s += c + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;

    }
    public int getFatorial() {
        return fat;
    }
    public String getFormula() {
        return formula;
    }
}
