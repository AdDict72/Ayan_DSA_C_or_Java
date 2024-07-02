public class RevArr {
   static void printarr(int arr[],int n){
      System.out.print("Reversed array is : \n");
      for(int i = 0; i<n ; i++){
         System.out.print(arr[i]+" ");
      }
   }
   static int reverseArray(int arr[],int start,int end){
      if(start>end){
         return 0;
      }
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      return reverseArray(arr, start+1, end-1);

   }
   public static void main(String[] args) {
         int e = 5;
         int arr[] = { 5, 4, 3, 2, 1};
         reverseArray(arr, 0 ,e-1);
         printarr(arr, e);
     }
   
}


// public class RevArr {
//     static void printArray(int ans[], int n) {
//        System.out.print("Reversed array is:- \n");
//        for (int i = 0; i < n; i++) {
//           System.out.print(ans[i] + " ");
//        }
//     }
//     static void reverseArray(int arr[], int n) {
//        int[] ans = new int[n];
//        for (int i = n - 1; i >= 0; i--) {
//           ans[n - i - 1] = arr[i];
//        }
//        printArray(ans, n);
//     }
//     public static void main(String[] args) {
//        int n = 5;
//        int arr[] = { 5, 4, 3, 2, 1};
//        reverseArray(arr, n);
//     }
//  }