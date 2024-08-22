import java.util.Scanner;

public class Leader {
    public static void Leader_in_array(int n,int[] arr){
        int leader = arr[n-1];
        for(int i=n-1; i>=0 ; i--){
            if () {
                
            }
        } 
    }
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms in array : ");
        int n = sc.nextInt();
        
        int arr[] =  new int[n];
        System.out.println("Enter array elements one by one...");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        Leader_in_array(n, arr);
        sc.close();
    }
}
