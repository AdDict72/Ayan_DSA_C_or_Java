class MergeSort {
  public static void conquer(int arr[], int s, int mid, int e){
    int merge[] = new int [e-s+1];
    
    int indx1 = s;
    int indx2 = mid+1;
    int indxM = 0;

    while (indx1<=mid && indx2<=e) {
      if (arr[indx1]<=arr[indx2]){
        merge[indxM] = arr[indx1];
        indx1++; indxM++;
      }
      else{
        merge[indxM] = arr[indx2];
        indx2++;  indxM++;
      }
    }
    while (indx1 <= mid) {
      merge[indxM] = arr[indx1];
      indx1++; indxM++;      
    }
    while (indx2 <= e) {
      merge[indxM] = arr[indx2]; 
      indx2++; indxM++;
    }
    for(int i = 0 ,j = s; i<merge.length ; i++ ,j++ ){
      arr[j] = merge[i];
    }
  }
  public static void divide(int arr[],int s , int e){
    if (s>=e) {
     return; 
    }
    int mid = s + (e-s)/2;
    divide(arr, s, mid);
    divide(arr, mid+1, e);
    conquer(arr, s, mid, e);
  }
  //O(nlogn)
  public static void main(String[] args) {
    int arr[] = {5,2,3,4,9,1,6};
        int len = arr.length;
        divide(arr, 0, len-1);
        
        System.out.println("The array is :");
        for(int i =0 ; i<len ; i++){
            System.out.print(arr[i]+" ");
        }

  }
}

