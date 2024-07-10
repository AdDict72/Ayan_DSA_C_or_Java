public class RotateNpos {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int k = 2;
        char d = 'l';
        if (d=='r') {
            Rotatetoright(arr, n, k); 
        }
        else if (d=='l') {
            Rotatetoleft(arr, n, k);
        }
        
        System.out.println("After Rotating the elements to right ");
        for (int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
        }
    }
    private static void Rotatetoleft(int[] arr, int n, int k) {
        if (n==0) {
            return;
        }
        k  = k%n;
        if(n<k){
            return;
        }
        int temp[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            temp[i] = arr [i];
        }
        for(int j = 0 ; j<n-k ; j++){
            arr[j] = arr[j+k];
        }
        for(int m = n-k ; m<n ; m++){
            arr[m] = temp[m+k-n];
        }
    }

    private static void Rotatetoright(int[] arr, int n, int k) {
        if (n==0) {
            return;
        }
        k  = k%n;
        if(n<k){
            return;
        }
        int temp[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            temp[i] = arr [i];
        }
        int m=0;
        for(int j = k ; j<n ; j++){
            arr[j] = temp[m];
            m++;
        }
        m=0;
        for(int p = n-k ; p<n ; p++){
            arr[m] = temp[p];
            m++;
        }
    }
}