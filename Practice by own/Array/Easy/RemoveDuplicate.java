public class RemoveDuplicate {
    static void RemoveDuplicateElement(int arr[], int n){
        int arrWD[] = new int[n];
        arrWD[0] = arr[0] ;
        int j = 1;//index of arrWD

        for(int i = 0 ; i<n-1 ; i++){
            if (arr[i]!=arr[i+1]) {
                arrWD[j] = arr[i+1];
                j++;
            }
            else{
                continue;
            }
        }
        System.out.println("Removed duplicate array is :");
        for(int k = 0 ; k<n ; k++){
            System.out.print(arrWD[k] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,1,2,2,3,3,4,4,5};
        int len = arr.length;
        RemoveDuplicateElement(arr,len);
    }
}
