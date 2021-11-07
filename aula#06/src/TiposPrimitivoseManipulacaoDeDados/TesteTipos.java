package TiposPrimitivoseManipulacaoDeDados;

public class TesteTipos {
    public static void main(String[] args) {
        //int idade = 30;
        //string nao recebe valor diretamente
        //String valor = idade;
        //Correto é conforme abaixo:
        /*String valor = Integer.toString(idade);
        System.out.println((valor));
        */

        String valor = "31";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);

    }
}
