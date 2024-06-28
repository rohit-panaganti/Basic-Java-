public class Sort {
    public static void main(String[] args) {
        int nums[] = {1,2,99,4,5,6,7,8,9,10};
        int temp;
        for(int i=0;i<10;i++){
            for(int j=0;j<9-i;j++){
                System.out.println(nums[j]);
                if(nums[j] > nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    System.out.println(nums[j]);
                }
            }
        }
        for(int i: nums){
            System.out.print(i + " ");
        }
        

    }
}
