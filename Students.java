import java.util.ArrayList;
import java.util.List;

/**
 * InnerStudents
 */
class A {
    int age;
    String name;
    
    
    
    public A(int age, String name) {
        this.age = age;
        this.name = name;
    }



    public String toString() {
        return "A [age=" + age + ", name=" + name + "]";
    }
    
    
}






public class Students {
    public static void main(String[] args) {
        A stud1= new A(10,"Rohit");
        A stud2= new A(43,"Rohit Bhai");
        A stud3= new A(43,"Rohit Bhai");
        
        List<A> lst = new ArrayList<A>();
        lst.add(stud1);
        lst.add(stud2);
        lst.add(stud3);
        lst.add(new A(90, "Dying soon"));
        // System.out.println(lst);
        for(A std : lst){
            System.out.println(std.age + ":" + std.name);
        }



    }
}
