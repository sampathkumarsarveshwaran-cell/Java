class Sample{

    public Sample() {
        System.out.println("Constructor - Object Creation");
    }
    public void getInfo(){
        System.out.println("Get Info");
    }
}
public class AnonymousDemo {
    public static void main(String[] args) {
        Sample s; // s is reference of object
        s = new Sample(); // this is where object is created

        new Sample(); // anonymous object created. this is not linked to any refence of object

        new Sample().getInfo(); // anonymous object used to call method. 
    }
}
