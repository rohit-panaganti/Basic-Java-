import java.util.Scanner;

public class sub {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String str;
        int c=1;
        Scanner sc = new Scanner(System.in);
        str=sc.nextLine();
        int j=1;
        for(int i=0;i<str.length();i++){
            if(j<str.length()){
                Character a=(Character)str.charAt(i);
                Character b=(Character)str.charAt(j);
                if(!a.equals(b)){
                    c++;
                    j=j+1;
                }
            
                
            }
        }
        System.out.println(c);
        
        
        
        
        
        
        
        
        // System.out.println(b);
    }
}
