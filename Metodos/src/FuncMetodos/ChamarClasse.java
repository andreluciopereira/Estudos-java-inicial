package FuncMetodos;

public class ChamarClasse {

    /*
    "public" torna o metodo publico, qualquer um pode acessar;
    "static" o metodo é istatico, voce nao precisa transforma-lo em objeto para utilizar;
    "void" o metodo nao retorna um valor;
    "String[] args" indica que args é um vetor de string.
     */
    public static void main(String[] args) {
    //se utilizar o metodo como "private" nao será possivel acessar de outras aplicações.

        System.out.println("Vai começar a contagem: ");
        System.out.println(Operacoes.contador(1,7));
    }
}
