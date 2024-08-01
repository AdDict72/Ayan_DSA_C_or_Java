public class MissinNumber{
    static void findMissing(int arr[],int n){
        int sum = (n*(n+1))/2;
        int sumArr = 0;
        for(int i = 0 ; i<n-1 ; i++){
            sumArr = arr[i] + arr[i+1];
        }
        int res = sum - sumArr;
        System.out.println("The missing element is : " + res);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        int len = arr.length;
        findMissing(arr,len);
    }
}