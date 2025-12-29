class Mobile{
    String brand;
    String model;
    int cost;

    // if we want the same value for all object, we can use static keyword 
    static boolean simSlot;
    // Below static block will be executed only once. 
    static{
        simSlot = true;
        System.out.println("Static Block Called. ");
        // more variables if needed
    }


    // Constuctor gets called everytime a class is loaded. 
    // Class is loaded when an object is created then objects are instantiated
    // When loading class, it will call static block
    public Mobile() {
        brand = "Default";
        model = "Default";
        cost = 0;
        System.out.println("Constructor Is Called");
    }

    
    // Non static method -> We need to have an object to call non static method
    public void info(){
        System.out.println(brand + " : " + model + " : " + cost + " : " + simSlot);
    }

    // public static void infoStatic(){
    //     System.out.println(brand + " : " + model + " : " + cost + " : " + simSlot); // This doesnt work because, we are asking it to print instances of class but not telling which instance
    //     // it wont know if it is the model of m1 or m2
    // }

    // Static method -> We dont need obj. Can be called using class name
    public static void infoStatic(Mobile objMobile){
        System.out.println(objMobile.brand + " : " + objMobile.model + " : " + objMobile.cost + " : " + simSlot); 
    }

     // Static method -> We dont need obj. Can be called using class name
    public static void infoStatic(){
        System.out.println(simSlot); 
    }


}
public class StaticDemo {
    public static void main(String[] args) { // This is static because main has to be called without obejct creation. 
                                            // Consider this was non static. Then we have to create obj of StaticDemo. THen call obj.Main()
                                            // But the code doenst know where to start the execution. Hence main is made static. 
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.model = "15 Pro";
        m1.cost = 1000;
        m1.info();
        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.model = "25";
        m2.cost = 800;
        m2.info();
        Mobile m3 = new Mobile();
        m3.info();
        System.out.println(Mobile.simSlot); // Static variables can be called using the Class name instead of the object name 
        m1.simSlot = false; // This is not suggested. 
        System.out.println(m1.simSlot); // In the above case, we set the simSlot only for m1. But since m1 was static, it changes for everything
        m1.simSlot = true; // This is not suggested. 
        System.out.println(Mobile.simSlot); // static value changed from true to false.

        Mobile.infoStatic(m1); // Object passed here. Method Overloading 
        Mobile.infoStatic(); // No object passed. Static variable could be printed
        m1.info(); // Non static method. Hence we need object to call it
    }   
}
