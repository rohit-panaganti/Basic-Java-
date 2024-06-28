public class Quick {
    public static void QuickSort(int[] arr, int low, int high) {
    if(low < high){
        int pivot=partition(arr,low,high);
        QuickSort(arr,low,pivot-1);
        QuickSort(arr,pivot+1,high);
    }

    }
    public static int partition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void main(String[] args) {
        //pivot//
        int arr[]={1,2,9,4,5,6};
        QuickSort(arr,0,arr.length-1);
        for(int i: arr){
            System.out.print(i);
        }
    }

    
}
