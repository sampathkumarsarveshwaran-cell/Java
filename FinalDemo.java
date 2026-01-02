final class FinalDemoA{
    public void creator(){
        System.out.println("Developed By Foo");
    }
}


/*class FinalDemoB extends FinalDemoA{ //The type FinalDemoB cannot subclass the final class FinalDemoA => Because FinalDemoA CLASS if FINAL. Cannot be EXTENDED
    public void creator(){
        System.out.println("Developed By Hoo");
    }
}*/

class FinalDemoB{
    final public void creator(){
        System.out.println("Developed By Foo");
    }
}

/*class FinalDemoC extends  FinalDemoB{
    public void creator(){ // creator() in FinalDemoC cannot override creator() in FinalDemoB overridden method is final => METHOD 
        System.out.println("Developed By Hoo");
    }
}*/

public class FinalDemo {
    public static void main(String[] args) {
        final int a = 5;
        // a = 6; -> Cant change VARIABLE once declared as FINAL
    }
}
