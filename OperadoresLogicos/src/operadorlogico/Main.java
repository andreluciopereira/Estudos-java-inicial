package operadorlogico;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;

        boolean r;
        //r = (x<y && y<z)?true:false;
        //r = (x<y && y==z)?true:false;
        //r = (x<y || y==z)?true:false;
        r = (x<y ^ y<z)?true:false;
        System.out.println(r);
    }
}
