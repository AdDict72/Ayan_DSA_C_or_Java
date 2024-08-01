class CountFrequency{
    static void countFre(int arr[], int n){
        int visitedArr[] = new int[n];
        int visited = -1;

        for(int i = 0 ; i<n ; i++){
            int count =1;
            for(int j = i+1 ; j<n ; j++){
                if (arr[i]==arr[j]){
                    count++;
                 visitedArr[j] = visited;        
                }
            }
            if  (visitedArr[i]!=visited) {
                visitedArr[i] = count;
            }
        }
        for(int i=0;i<n;i++){
            if(visitedArr[i]!=visited){
                System.out.println (arr[i]+" "+visitedArr[i]+" ");
        }
    }


    }
    public static void main(String[] args) {
        int arr[] = {3,5,7,3,5,4,7,7};
        int len = arr.length;
        countFre(arr, len);
    }
}