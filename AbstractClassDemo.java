/*class CarAbstractClassDemo{
    public void drive(){

    }
    public void playMusic(){
        System.out.println("Playing Music");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        CarAbstractClassDemo c = new CarAbstractClassDemo();
        c.drive();
        c.playMusic();
    }
}*/

// The issue with above is, with this appraoch we can use method even without defining them. 
// If we want to create a class which only has a structure but the extending class should implement then we can make use of abstract class. 

abstract class CarAbstractClassDemo{
    // abstract class can have only abstract methods or mix of abstract and non abstract or only non abstract methods too
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing Music");
    }
}
class WagonR extends CarAbstractClassDemo{
    public void drive() {
        System.out.println("Driving Car");
    }

}

public class AbstractClassDemo {
    public static void main(String[] args) {
        CarAbstractClassDemo c = new WagonR(); // When using abstract classes, we can create refrence of abstract class but create object only of non abstract class
        c.drive();
        c.playMusic();
    }
}
