class AnonymousClassDemo1{
    public void show(){
        System.out.println("in 1 Show");
    }
}
public class AnonymousClassDemo {
    public static void main(String[] args) {
        // AnonymousClassDemo1 a1 = new AnonymousClassDemo1();
        // a1.show();
        AnonymousClassDemo1 a1 = new AnonymousClassDemo1()
        {
            public void show(){
                System.out.println("in inner Show");
            }
        };
        a1.show();
    }
}
