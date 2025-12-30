class Humann{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name; // this holds the instance of the class (h1)
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}

public class ThisDemo {
    public static void main(String[] args) {
        Humann h1 = new Humann();
        h1.setAge(10);
        h1.setName("Foo");        
        System.out.println(h1.getName());
    }
}

//https://www.youtube.com/watch?v=k_SJOnVa_G0&list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5&index=45