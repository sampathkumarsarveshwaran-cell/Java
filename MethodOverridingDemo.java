class Calc1{
    public int add(int n1, int n2){
        return n1+n2;
    }
}

class AdvCalc1 extends Calc1{
    public int add(int n1, int n2){ // overriding add from super class
        return n1+n2+1;
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        AdvCalc1 a = new AdvCalc1();
        System.out.println(a.add(5, 4));
    }
}
