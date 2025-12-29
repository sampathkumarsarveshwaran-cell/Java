public class StringDemo {
    public static void main(String[] args) {
        String s = "abc";
        // here String is actually a class. Not like other data types like int, float. 
        // but we are not using the usual way to create an instance of class like
        String s1 = new String();
        s1 = "bcd";
        // this is because Java can do this behind the scenes. So just declaring works. 
        System.out.println(s);
        System.out.println(s1);
        // Because String is a class, we will be making use of the heap memory. 
        // Stack will contain s and s1
        // Heap will contain instance variable and String methods
        // Stack string s will contain the address of heap s 
        // Stack string s1 will contain the address of heap s1
        String s2 = "bcd";
        //here s1 and s2 has the same value bcd
        //these both will refer to the same location 
        // heap has string contant pool 
        // here there will be two entries, -> abc -> bcd 
        // stack s will point to abc and s1 and s2 will point to bcd location 
        s += " def";
        System.out.println(s);
        // here a new entry will be created in heap for "abc def" and will be linked to s
        // initial address for "abc" will be made ready for garbage collection 

        //Mutable -> StringBuffer (Thread Safe) and StringBuilder (Not Thread Safe)
        StringBuffer sb = new StringBuffer("abc");
        System.out.println(sb);
        sb.append(" def");
        System.out.println(sb);

    }
}
