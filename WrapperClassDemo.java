public class WrapperClassDemo {
    public static void main(String[] args) {
        int i = 5;
        Integer ii = new Integer(6); // Integer is the wrapper class. Has many methods which can be used on int. Can be used on primitive types.
        //ii = 6;
        System.out.println(ii);
        ii = i; // Auto Boxing -> Assign primitive type to object type
        System.out.println(ii);

        int ii2 = ii.intValue(); // Unboxing -> fetch object value to primitive type 
        System.out.println(ii2);

        String s1 = "12";
        int i2 = Integer.parseInt(s1);
        System.out.println(i2*2);

    }
}
