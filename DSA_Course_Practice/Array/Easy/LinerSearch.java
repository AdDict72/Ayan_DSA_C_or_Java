public class LinerSearch {
    public static void main(String[] args) {
        int arr[] ={1,5,4,3,2,0,8,9,6};
        int len = arr.length;
        int ele = 8;
        LSearch(arr,len,ele);
    }

    private static void LSearch(int[] arr, int n, int ele) {
        for(int i = 0 ; i<n ; i++){
            if (arr[i] == ele) {
                System.out.println("Found element " + ele + " in posistion of index " + i);
                break;
            }
        }
        return;
    }
}
