public class Bubble {
    public static void main(String[] args) {
        int arr[] = {5,2,3,4,9,1,6};
        int len = arr.length;
        System.out.println("The array is :");
        for(int i =0 ; i<len ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        BubbleSort(arr, len);
    }
    
    static void BubbleSort(int arr[],int n){
        for(int j =0 ;j<n;j++){
        for(int i = 0 ; i<n-1 ; i++){
            if (arr[i]>arr[i+1]) {
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }
       }
        System.out.println("After Bubble sort : ");
        for(int k = 0 ; k<n ; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
