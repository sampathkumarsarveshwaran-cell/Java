class sampleClass{
    int age;
    String name;

    // default constructor
    public sampleClass(){
        age = 12;
        name = "Foo";
    }

    // parameterized constructor
    public sampleClass(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void getInfo()
    {
        System.out.println(name + " : " + age);
    }

}
public class ConstructorDemo {
    public static void main(String[] args) {
        sampleClass dc = new sampleClass();
        dc.getInfo();
        sampleClass pc = new sampleClass(10, "Hoo");
        pc.getInfo();

    }
}
