class human{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        if (a>0)
            age = a;
        else
            age = 0;
    }

    public void getInfo(){
        System.out.println(name + " : " + age);
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        human h1 = new human();
        h1.setName("Foo");
        h1.setAge(-5);
        human h2 = new human();
        h2.setName("Hoo");
        h2.setAge(10);
        h1.getInfo();
        h2.getInfo();
    }
}
