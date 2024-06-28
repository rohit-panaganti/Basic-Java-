import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class key {
    public static void main(String[] args) {
        Map<String,Integer> value = new Hashtable<String,Integer>();
        value.put("Nickhil",98);
        value.put("MAHESH",95);
        value.put("LAPA",94);
        value.put("KALKI",91);
        value.put("Nickhil",67);
        for(String str : value.keySet()){
            System.out.println(str + " : " + value.get(str));
        }

    }
}
