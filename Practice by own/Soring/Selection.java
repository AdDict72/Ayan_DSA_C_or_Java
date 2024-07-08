class Selection{
    static void selectionSort(int arr[],int n){
        for(int i =0; i<n ; i++){
            int min = i;
            for(int j = i+1; j<n ; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

            System.out.println("After selection sort : ");
            for(int k = 0 ; k<n ; k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,2,3,4,9,1,6};
        int len = arr.length;
        System.out.println("The array is :");
        for(int i =0 ; i<len ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        selectionSort(arr, len);
    }
}