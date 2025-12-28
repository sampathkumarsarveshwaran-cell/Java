

public class Loops {
    public static void main(String[] args) {
        int x = 55;
        int y = 20;
        int z = 85;
        int result = 0;

        // if (x>y)
        //     System.out.println(x);
        // else
        //     System.out.println(y);

        result = (x>y)? x : y;
        System.err.println(result);

        // if (x>y && x>z)
        //     System.out.println(x);
        // else if (y>z)
        //     System.out.println(y);
        // else
        //     System.out.println(z);

        result = (x>y && x>z)?x:(y>z)?y:z;
        System.err.println(result);
    }
}
