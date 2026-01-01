/*
Polymorphism -> Many Behaviours
Two types 
1. Complile Time -> Method Overloading. Add(n1,n2) and Add(n1,n2,n3). During compile time which method will be identified.
2. Run Time -> Overriding. Class A add(). Class B extends A add(). During run time which method will be identified.
*/

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
