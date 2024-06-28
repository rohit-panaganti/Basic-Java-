class A{
    int a;
    class B{
        int b=10;
        public void set(){
            System.out.println(b);
        }
    }
}

public class demo

{
    public static void main(String args[] )
    {
        A obj = new A();
         A.B obj1 = obj.new B();
         obj1.set();
    }
}