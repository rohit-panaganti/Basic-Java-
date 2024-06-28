public class selection {
    public static void main(String[] args) {
       int nums[]= {1,2,3,4,5,6,7,8,9} ;
       int max=-1;
       int k=nums.length;
       for(int i=nums.length-1;i>0;i--){
        max=0;
        for(int j=0;j<nums.length;j++){
           
            if(nums[j] > nums[max]){
                max=j;
            }
        }
        int temp=nums[max];
        nums[max]=nums[i];
        nums[i]=temp;

        System.out.println(i);
        for(int in:nums){
            System.out.print(in);
        }
        
       }
    }
}
