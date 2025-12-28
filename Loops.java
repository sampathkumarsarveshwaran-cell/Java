

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

        int n = 6;
        switch (n) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 6,7 -> System.out.println("Weekend");
            default -> throw new AssertionError();
        }

        // Switch as an expression
        // Swithc can return value 

        int n1 = 6;
        String result1 = "";
        result1 = switch (n1) {
            case 1 -> ("Monday");
            case 2 -> ("Tuesday");
            case 6,7 ->("Weekend");
            default -> throw new AssertionError();
        };
        System.out.println(result1);

        n1 = 6;
        result1 = "";
        result1 = switch (n1) {
            case 1 : yield  ("Monday");
            case 2 : yield ("Tuesday");
            case 6,7 : yield ("Weekend");
            default : throw new AssertionError();
        };
        System.out.println(result1);

        // Print Hi 5 Times
        // While Loop

        int wLoop = 1;
        while (wLoop<=4){
            System.out.println("Hi " + wLoop);
            int innerLoop = 1;
            while (innerLoop <= 3){
                System.err.println("Hello " + innerLoop);
                innerLoop ++;
            }
            wLoop ++;
        }

        System.out.println("\n");
        // Do While

        int dWLoop = 1;
        do { 
            System.out.println("Hi " + dWLoop);
            dWLoop ++;
        } while (dWLoop<= 4);

        System.out.println("\n");

        for (int i = 1; i<=4; i++){
            System.err.println("Hi " + i);
        }

        System.out.println("\n");

        for (int d=1; d<=7; d++){
            System.out.println(d);
            for (int h=1;h<=24;h++){
                System.out.println(h);
            }
            System.err.println("\n");
        }

    }
}
