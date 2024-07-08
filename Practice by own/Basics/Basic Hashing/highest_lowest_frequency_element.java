public class highest_lowest_frequency_element {
    static void HLele(int arr[],int n){
        int visited[] = new int[n];
        int visit = -1;
        int maxF = 0, minF = n;
        int max = 0 , min =0;
        for(int i = 0 ; i <n ; i++){
            if (visited[i]==visit) {
                continue;
            }
            int count=1;
            for(int j = i+1; j<n ; j++){
                if (arr[i]==arr[j]) {
                    count++;
                    visited[j] = visit;
                }
            }
            if(count>maxF){
                max = arr[i];
                maxF = count;
            }
            if (count<minF) {
                min = arr[i];
                minF = count;                
            }
        }   
        System.out.println ("The highest frequency element is: " +max);
        System.out.println ("The lowest frequency element is: "+min);
    }
    public static void main(String[] args) {
        int arr[] = {5,10,2,0,0,5,2,2,2,5};
        int len = arr.length;
        HLele(arr,len);
    }
}
