class ObjectClassDemo1{
    int num;
    // public String toString(){
    //     return ("Num : " + num );
    // }

    @Override
    public String toString() {
        return "ObjectClassDemo1 [num=" + num + "]";
    }

    // We can let IDE generate the toString() too

    // @Override
    // public int hashCode() {
    //     int hash = 7;
    //     hash = 71 * hash + this.num;
    //     return hash;
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj) {
    //         return true;
    //     }
    //     if (obj == null) {
    //         return false;
    //     }
    //     if (getClass() != obj.getClass()) {
    //         return false;
    //     }
    //     final ObjectClassDemo1 other = (ObjectClassDemo1) obj;
    //     return this.num == other.num;
    // }
    
    // public boolean equals(ObjectClassDemo1 that){
    //     return this.num == that.num;
    // }

    public boolean equals(Object that){
        return this.num == ((ObjectClassDemo1) that).num;
    }

}
public class ObjectClassDemo {
    public static void main(String[] args) {
        ObjectClassDemo1 a = new ObjectClassDemo1();
        a.num = 5;
        System.out.println(a); // prints -> ObjectClassDemo1@251a69d7
        // This is because this internally calls a.toString()
        System.out.println(a.toString()); // prints -> ObjectClassDemo1@251a69d7
        //If we want to overwrite the toString behavior, we can define that in the local class. 

        // After defining local toString() in ObjectClassDemo1
        System.out.println(a); // Num : 5
        System.out.println(a.toString()); // Num : 5 

        // After defining local toString() in ObjectClassDemo1 using SOURCE ACTION (IDE)
        System.out.println(a); // ObjectClassDemo1 [num=5]
        System.out.println(a.toString()); // ObjectClassDemo1 [num=5]

        ObjectClassDemo1 b = new ObjectClassDemo1();
        b.num = 5;
        System.out.println(a == b);
        System.out.println(a.equals(b));

        // Without overwriting equals(), both returns false because of hascode. Check hashCode()
        // If we want to compare the value instead of the reference, then we can overwrite the equals method either manually or using IDE
        // Post doing that, a==b will return false and a.equals(b) will return true

    }
}
