class A{
    int a;
    class B{
        int b=10;
        public void set(){
            System.out.println(b);
        }
    }
}
public class anonymos {
    public static void main(String[] args) {
        A objA = new A();
        A.B obj = objA.new B(){
            public void set(){
                System.out.println(b + "new ");
            }
        };
        obj.set();
        
        
    }
}
