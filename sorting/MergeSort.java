public class MergeSort {
    



    public static void MergeSort(int[] arr, int l, int r) {
        if (l<r) {
         int mid=(l+r)/2;   
         MergeSort(arr, l, mid);
         MergeSort(arr, mid+1, r);
         Merge(arr,l,mid,r);
        }
    }
    

    public static void Merge(int[] arr, int l, int mid, int r) {
        int n1=mid-l+1;
        int n2=r-mid;
        int larr[]=new int[n1];
        int rarr[]=new int[n2];
        for(int i=0;i<n1;i++)
        {
           larr[i]= arr[l+i];

        }
        for(int i=0;i<n1;i++)
        {
           rarr[i]= arr[mid+1+i];

        }


        int i=0;
        int j=0;
        int k=l;
        while (l<n1 && j<n2) {
            if(larr[i] <= rarr[j]){
                arr[k] = larr[i];
                i++;
                
            }
            else{
                arr[k]=rarr[j];
                j++;
            }
            k++;



        }
        while (i<n1) {
            arr[k]=larr[i];
            i++;
            k++;
        }
        while (j<n2) {
            arr[k]=rarr[j];
            j++;
            k++;
        }


    }
    
    
    
    
    





    public static void main(String[] args) throws Exception {
        int arr[]={1,5,7,9,0,35,55};
        System.out.println("Before Sorting");
        for(int i: arr){
            System.out.print(i);
        }


        MergeSort(arr,0,arr.length-1);
    }

    
}
