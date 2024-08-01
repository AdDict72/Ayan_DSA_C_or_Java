public class ArraySorted {
    static void isArraySorted(int arr[],int n){
        boolean isSorted = true;
        for(int i = 0 ; i<n-1 ; i++ ){
            if (arr[i]<arr[i+1]) {
                isSorted = true;
            }
            else {
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }else{
            System.out.println("The Array is not sorted");
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7};
        int len = arr.length;
        isArraySorted(arr,len);
    }
}
