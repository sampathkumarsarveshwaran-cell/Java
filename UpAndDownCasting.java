class UpAndDownCastingA{
    public void show(){
        System.out.println("A Show");
    }
    public void configA(){
        System.out.println("A configA");
    }
}

class UpAndDownCastingB extends UpAndDownCastingA{
    public void show(){
        System.out.println("B Show");
    }
    public void configB(){
        System.out.println("A configB");
    }
}

public class UpAndDownCasting {
    public static void main(String[] args) {
        UpAndDownCastingA a = new UpAndDownCastingA();
        a.show();
        a.configA();

        System.out.println("\n");

        UpAndDownCastingA a1 = new UpAndDownCastingB();
        a1.show(); // a1 can see only methods of UpAndDownCastingA. But it gets overwritten by show from B class  at run time. 
        a1.configA(); // a1 cant see configB from B class. 
        
        System.out.println("\n");
        // a1.configB();
        // Solution below: 
        UpAndDownCastingB b1 = (UpAndDownCastingB) a1; // Downcasting from Superclass to Subclass
        b1.configB();

        System.out.println("\n");
        UpAndDownCastingA a2 = (UpAndDownCastingA) new UpAndDownCastingB(); //Upcasting because upcasted to SuperClass. Same as 27. Java does it internally. 
        a2.show();

    }
}



/*
Polymorphism -> Many Behaviours
Two types 
1. Complile Time -> Method Overloading. Add(n1,n2) and Add(n1,n2,n3). During compile time which method will be identified.
2. Run Time -> Overriding. Class A add(). Class B extends A add(). During run time which method will be identified.


class Phone
{
    public void show()
    {
        System.out.println("Show From Phone");
    }
}

class SmartPhone extends Phone
{
    @Override
    public void show()
    {
        System.out.println("Show From SmartPhone");
    }

    public void config()
    {
        System.out.println("Config From SmartPhone");
    }
}

class FoldablePhone extends Phone{
    @Override
    public void show()
    {
        System.out.println("Show From FoldablePhone");
    }
}

public class PolymorphismDemo {
    // Run time polymorphism -> Dynamic Method Dispatch
    public static void main(String[] args) {
        Phone p = new Phone();
        p.show();
        
        SmartPhone sp = new SmartPhone();
        sp.show();
        sp.config();

        // Reference Of Super Class To Object To Sub Class. // Sub Class To Super Class Is Not Possible. 
        // In this case we can call only methods which are there in Super Class. 
        Phone p1 = new SmartPhone(); // Run Time Polymorphism  - Linked During Run Time
        p1.show(); // Since object is assigned during runtime, which method to use is also determined using run time. 
        //p1.config(); // Phone cant see Config From SP

        p1 = new FoldablePhone(); 
        p1.show(); // Since object is assigned during runtime, which method to use is also determined using run time. Since this changes everytime, this is called Dynamic Method Dispatch

        
    }
}

*/