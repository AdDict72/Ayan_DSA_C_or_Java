public class SubArrSum {
    public static void main(String[] args) {
        int arr[] ={3,4,3,8,5};
        int len = arr.length;
        int k = 10;
        getSub(arr,len,k);
    }
    private static void getSub(int[] arr, int n, int k) {
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            sum = sum +arr[i];
            if (sum == k) {
                System.out.println("Add first " + (i+1) + " elements to get the sum.");
                break;
            }
        }

    }
}
