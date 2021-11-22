package operadorternario;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n1, n2, res;
        n1 = 4;
        n2 = 8;

        //res = (n1>n2)?0:1;
        //res = (n1>n2)?n1:n2;
        //res = (n1>n2)?n1+n2:n1-n2;
        //res = (n1<n2)?n1+n2:n1-n2;
        res = (n1 == n2)?n1+n2:n1-n2;
        System.out.println(res);
    }
}
