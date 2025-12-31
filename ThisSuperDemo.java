class A{
    public A() // extends Object => This is how Java auto interprets this. 
    {
        super(); // Calls constructor or super class (A). Even if we dont specify, Java will internally call super()
        System.out.println("A - Default Constructor");
    }
}
class B extends A{
    public B(){
        super(); // Calls constructor or super class (A). Even if we dont specify, Java will internally call super()
        System.out.println("B - Default Constructor");
    }
    public B(int n){
        super(); // Calls constructor or super class (A). Even if we dont specify, Java will internally call super()
        // In super if we pass n, then it will look for Constructor which takes one paramter and runs that instead of default constructor. 
        // super(n) -> will call -> A(int n)
        

        // this(); // this will call the constructor of the current class. 
        
        
        System.out.println("B - Parameterized Constructor");
    }
}
public class ThisSuperDemo {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("\n");
        B b1 = new B(5);
    }
}
