public class RecInsertion {
    static int recin(int arr[],int i , int n){
        if (i ==n) {
            return 0;
        }

        int j = i;
        while (j>0 && arr[j]<arr[j-1]){
            int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
        }
        
        return recin(arr, i+1, n);
    }
    public static void main(String[] args) {
        int arr[] = {5,2,3,4,9,1,6};
        int len = arr.length;
        System.out.println("The array is :");
        for(int i =0 ; i<len ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        recin(arr,0, len);

        System.out.println("After insertion sort : ");
        for(int k = 0 ; k<len ; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
