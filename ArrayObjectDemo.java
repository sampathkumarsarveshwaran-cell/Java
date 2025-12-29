class Student{
    int rollNum;
    String name;
}

public class ArrayObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Foo";
        s1.rollNum = 1;
        Student s2 = new Student();
        s2.name = "Hoo";
        s2.rollNum = 2;
        Student allS[] = new Student[2];
        allS[0] = s1;
        allS[1] = s2;

        for (Student s : allS){
            System.out.println(s.name + " : " + s.rollNum);
        }

        for (int i=0; i< allS.length; i++){
            System.out.println(allS[i].name + " : " + allS[i].rollNum);
        }
    }
}
