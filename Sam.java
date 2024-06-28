
@FunctionalInterface
interface Laptop{
    int show(int i,int j);
}



public class Sam {
    public static void main(String[] args) {
        System.out.println("hello world");
        Laptop obj =(i,j) -> i+j;

            
        System.out.println(obj.show(10,20));
        
    }
}
