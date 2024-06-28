import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet<Integer>();

        for(int i=0;i<10;i++){
            nums.add((int)(Math.random()*10));
        }
        System.out.println(nums);
    }
}
