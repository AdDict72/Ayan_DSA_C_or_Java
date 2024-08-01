public class QuickSort {
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int   i = low-1;
        
        for(int j = low ; j<high ; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i;
    }
    public static void quickSort(int arr[], int low, int high){
        if (low < high) {
            int pindx = partition(arr,low,high);

            quickSort(arr, low, pindx-1);
            quickSort(arr, pindx+1, high);

        }
    }
    public static void main(String[] args) {
        int arr[] = {5,2,3,4,9,1,6};
            int len = arr.length;

            quickSort(arr, 0, len-1);

            System.out.println("The array is :");
            for(int i =0 ; i<len ; i++){
                System.out.print(arr[i]+" ");
            }
      }
}