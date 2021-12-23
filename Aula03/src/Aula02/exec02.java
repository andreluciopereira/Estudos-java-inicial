package Aula02;

public class exec02 {
    public static void main(String[] args) {

        Celular cel = new Celular();

        cel.marca = "Sansumg";
        cel.modelo = "A30s";
        cel.carga = 43;

        cel.dados();
        //cel.ligar();
        cel.desligar();
        cel.utilizar();

    }
}
