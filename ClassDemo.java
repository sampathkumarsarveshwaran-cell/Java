class Calculator{
    public int add(int n1, int n2){
        System.out.println("Adding " + n1 + " and " + n2);
        return n1+n2;
    }
    public double add(double n1, int n2){
        System.out.println("Adding " + n1 + " and " + n2);
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        System.out.println("Adding " + n1 + " and " + n2 + " and " + n3);
        return n1+n2+n3;
    }
    public int sub (int n1, int n2){
        System.err.println("Subtracting " + n2 + " from " +n1);
        return n2-n1;
    }
}
public class ClassDemo {
    public static void main(String[] args) {
        int retValue = 0;
        int num1 = 5;
        int num2 = 4;
        int num3 = 3;

        System.out.println("ClassDemo");
        Calculator c = new Calculator();
        retValue = c.add(num1, num2);
        System.out.println(retValue);
        System.out.println(c.add((double)num1, num2));
        retValue = c.add(num1, num2, num3);
        System.out.println(retValue);
        retValue = c.sub(num1, num2);
        System.out.println(retValue);
    }
}
