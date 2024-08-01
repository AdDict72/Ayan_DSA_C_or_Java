public class OneLeftRotate {
    static void OneLeftR(int arr[] , int n){
        int leftedArr[] = new int[n];
        int temp = arr[0];
        for(int i = 0 ; i<n-1 ; i++){
            leftedArr[i] = arr[i+1];
        }
        leftedArr[n-1]=temp;
        System.out.println("One position left rotated array : ");
        for(int i = 0 ; i<n ; i++){
            System.out.print( leftedArr[i] + " ");
        }

    }
    public static void main(String[] args) {
        int arr[] ={10,25,100,41,23,66};
        int len = arr.length;
        OneLeftR(arr, len);
    }
}
