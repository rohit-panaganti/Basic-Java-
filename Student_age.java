import java.util.ArrayList;
import java.util.List;

class Students{
    int age;
    String name;

    

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }



    public String toString() {
        return "Students [age=" + age + ", name=" + name + ", toString()=" + super.toString() + "]";
    }
    
    
}



public class Student_age {
    public static void main(String[] args) {
        List<Students> col=new ArrayList<>();
        col.add(new Students(10,"1"));
        col.add(new Students(60,"2"));
        col.add(new Students(30,"3"));
        col.add(new Students(90,"4"));
        col.add(new Students(80,"5"));
        
        col.forEach(i -> System.out.println(i));



    }

}
