import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class len {
    public static void main(String[] args) {
        Comparator<String> com = new Comparator<String>() {
            public int compare(String i,String j){
                if(i.length()>j.length()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };



        List<String> str = new ArrayList<>();
        str.add("Rocky");
        str.add("bai");
        str.add("is Doing");
        str.add("somewhere");

        Collections.sort(str, com);
        System.out.println(str);

    }
}
