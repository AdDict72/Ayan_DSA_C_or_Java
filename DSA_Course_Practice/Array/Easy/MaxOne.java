public class MaxOne {
    static void maxCount(int arr[],int n){
        int count= 0;
        int maxCount = 0;

        for(int i = 0  ; i<n ; i++){
            if (arr[i]==1) {
                count++;
                if (maxCount<count) {
                    maxCount = count;
                }                
            }
            else{
                count = 0;
            }
        }
        System.out.println(maxCount);
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,1,1,1,0};
        int len =arr.length;
        maxCount(arr,len);
    }
}
