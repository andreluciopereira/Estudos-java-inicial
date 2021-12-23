package Aula02;

public class Celular {

    String marca;
    String modelo;
    int carga;
    boolean desligado;

    void dados(){
        System.out.println("A marca é " + this.marca);
        System.out.println("O modelo é " + this.modelo);
        System.out.println("A carga da bateria esta em: " + this.carga);

    }

    void ligar(){
        this.desligado = false;

    }

    void desligar(){
        this.desligado = true;

    }

    void utilizar(){
        if (this.desligado == false){
            System.out.println("Celular esta ligado. Então pode ser utilizado");
        } else {
            System.out.println("Ligue o celular para utilizar.");
        }
    }
}
