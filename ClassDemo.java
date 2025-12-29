class Calculator{
    public int add(int n1, int n2){
        System.out.println("Adding " + n1 + " and " + n2);
        return n1+n2;
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

        System.out.println("ClassDemo");
        Calculator c = new Calculator();
        retValue = c.add(num1, num2);
        System.out.println(retValue);
        retValue = c.sub(num1, num2);
        System.out.println(retValue);
    }
}
