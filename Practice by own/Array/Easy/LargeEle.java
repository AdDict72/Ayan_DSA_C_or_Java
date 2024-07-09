public class LargeEle{
    static void LargeElement(int arr[],int n){
        int large = arr[0];
        for(int i = 1; i<n ;i++){
            if (large<arr[i]) {
                large = arr[i];
            }
        }
        System.out.println("Largest Number is : " + large);
    }
    public static void main(String[] args) {
        int arr[] ={10,25,100,41,99,23,66};
        int len = arr.length;
        LargeElement(arr,len);
    }
}