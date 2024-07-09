public class SecLargest {
    static void SecLargeElement(int[] arr,int n){
        int secLarge = 0;
        int large = 0;
        for(int i = 1; i<n ;i++){
            if (large<arr[i]) {
                secLarge = large; 
                large = arr[i];                               
            }
            else if ((secLarge == 0 || arr[i] > secLarge) && arr[i] != large) {
                secLarge = arr[i];
            }
        }
        System.out.println("Second large number is : " + secLarge);
        System.out.println("Largest Number is : " + large);
    }
    public static void main(String[] args) {
        int arr[] ={10,25,100,41,23,66};
        int len = arr.length;
        SecLargeElement(arr,len);
    }
}
