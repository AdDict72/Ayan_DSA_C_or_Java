public class insertion {
    static void insertionSort(int arr[],int n){
        for(int i = 0 ; i<=n-1 ; i++){
            int j= i;
            while (j>0 && arr[j]<arr[j-1]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println("After insertion sort : ");
        for(int k = 0 ; k<n ; k++){
            System.out.print(arr[k]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,2,3,4,9,1,6};
        int len = arr.length;
        System.out.println("The array is :");
        for(int i =0 ; i<len ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        insertionSort(arr, len);
    }
}
