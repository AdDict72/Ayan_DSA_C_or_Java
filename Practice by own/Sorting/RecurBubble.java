public class RecurBubble{
    public static void main(String[] args) {
        int arr[] = {5,2,3,4,9,1,6};
        int len = arr.length;
        System.out.println("The array is :");
        for(int i =0 ; i<len ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        recBubble(arr, len);

        System.out.println("The array after bubble sort is :");
        for(int i =0 ; i<len ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void recBubble(int arr[],int n){
        if (n == 1) {
            return;
        }
        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        recBubble(arr, n-1);
    }

   
}