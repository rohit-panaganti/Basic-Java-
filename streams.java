import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class streams {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,5,7,8,45,78,92);
        @SuppressWarnings("rawtypes")
        Stream s1=nums.stream().filter(n -> n%2==0);
        s1.forEach(i-> System.out.println(i));
    }
}
