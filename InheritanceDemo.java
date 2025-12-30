class Calc{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int sub(int n1, int n2){
        return n1 - n2;
    }
}

class AdvCalc extends Calc{ // Single Inheritance
    public int mul(int n1, int n2){
        return n1 * n2;
    }
    public int div(int n1, int n2){
        return n1 / n2;
    }
}

class VeryAdvCalc extends AdvCalc{ // Multi Level Inheritance
    public int pow(int n1, int n2){
        return (int)Math.pow(n1, n2);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        int r1 = c1.add(5, 3);
        int r2 = c1.sub(5, 3);
        System.out.println(r1 + " : " + r2);
        AdvCalc c2 = new AdvCalc();
        r1 = c2.add(5, 3);
        r2 = c2.sub(5, 3);
        int r3 = c2.mul(5, 3);
        int r4 = c2.div(5, 3);
        System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4);
        VeryAdvCalc c3 = new VeryAdvCalc();
        r1 = c3.add(5, 3);
        r2 = c3.sub(5, 3);
        r3 = c3.mul(5, 3);
        r4 = c3.div(5, 3);
        int r5 = c3.pow(5, 3);
        System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4 + " : " + r5);
    }
}

/*
Single Inheritance: Calc -> AdvCalc 
Multilevel Inheritance: Calc -> AdvCalc -> VeryAdvCalc 
Multiple Inhertance: NOT SUPPORTED IN JAVA: Calc -> VeryAdvCalc <- AdvCalc 
This is because, if there are same method in Calc and AdvCalc, java cannot figure out which one to use. 
Note: First it will look for method in the local class then on the parent class. 
*/