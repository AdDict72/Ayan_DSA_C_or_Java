public class MoveZero {
    public static void main(String[] args) {
        int[] arr = {1,0,0,2,0,6,0,1};
        int n = arr.length;
        ZeroMover(arr, n); 
        System.out.println("After Rotating the elements to right ");
        for (int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
        }
    }

    private static void ZeroMover(int[] arr, int n) {
        int check = -1;
        for(int i = 0 ; i<n ; i ++){
            if (arr[i]==0) {
                check = i;
                break;
            }
        }
        if (check == -1) {
            return;
        }
        int m = check;
        for(int j = m+1; j<n ; j++){

            if (arr[j]!=0) {
                int temp = arr[j];
                arr[j]=arr[m];
                arr[m] = temp;
                m++;
            }
            // for (int i = 0; i < n; i++) {
            //     System.out.print(arr[i] + " ");
            // }System.out.println();
        }
        return;
    }
}
