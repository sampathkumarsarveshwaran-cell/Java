class InnerClassDemoA{
    int a;
    public void show(){
        System.out.println("Show");
    }

    //static calss can be created only for inner class
    //static class InnerClassDemoB{
    class InnerClassDemoB{
        int b;
        public void config(){
            System.out.println("Config");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        InnerClassDemoA o1 = new InnerClassDemoA();
        o1.a = 6;
        o1.show();
        InnerClassDemoA.InnerClassDemoB o2 = o1.new InnerClassDemoB(); //Non Static Class. Hence need to use the outer class and its object
        //if we make B class as static, we can use the following:
        //InnerClassDemoA.InnerClassDemoB o2 = new InnerClassDemoA.InnerClassDemoB();
        o2.b = 10;
        o2.config();
    }
}
