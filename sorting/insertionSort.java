import java.util.ArrayList;
import java.util.List;

public class insertionSort {
    public static void main(String[] args) {
        int temp,key;
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(9);
        nums.add(9);
        nums.add(5);
        // System.out.println(nums);
        for(int i=1;i<nums.size();i++)
        {
            key=nums.get(i);
            int j=i-1;
            while (nums.get(j) >key && j >=0) {
                nums.set(j+1,nums.get(j));
                j--;
            }
            nums.set(j+1, key);
        }
        System.out.println(nums);
    }
}
