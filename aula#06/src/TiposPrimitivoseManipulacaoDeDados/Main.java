package TiposPrimitivoseManipulacaoDeDados;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String nome = "André";
        float nota = 8.5f;
        /* outra forma de declarar é
            float nota = (float) 8.5
            nao preciso de colocar o 'f' no final
         */
        //System.out.println("A nota é " + nota);
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        //após o . esta a quantidade de casas decimais que quero mostrar.
        //para quebrar a linha utilizo o \n
        //pode utilizar tambem a sintax System.out.format
    }
}
