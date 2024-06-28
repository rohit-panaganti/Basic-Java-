import java.util.ArrayList;
import java.util.List;

public class Dynamic {
    public static void main(String[] args) {
        //better to go with List with array List we have get function
        List<Integer> nums=new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            nums.add((int)(Math.random()*10));
        }
        System.out.println(nums);
    }
}
