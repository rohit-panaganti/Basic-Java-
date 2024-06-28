class Rocky extends Exception{
    Rocky(String S)
    {
        super(S);
    }
}
public class Execption_Demo {
    public static void main(String[] args) {
        int i=0;
        try{
        if(i==0){

        throw new Rocky("My Rocky is Zero not Hero");
        }
    }
    catch(ArithmeticException e){
        System.out.println(e);
    }
    catch(Rocky e){
        System.out.println(e);
    }

    System.out.println("hello worl");
    }
    

    
}
