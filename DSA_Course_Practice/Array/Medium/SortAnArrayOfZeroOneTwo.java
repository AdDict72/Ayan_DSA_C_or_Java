// Problem Statement: Given an array consisting of only 0s, 1s, and 2s. 
// Write a program to in-place sort the array without using inbuilt sort functions.
// ( Expected: Single pass-O(N) and constant space)
// This problem is a variation of the popular Dutch National flag algorithm. 

import java.util.Scanner;

public class SortAnArrayOfZeroOneTwo {

    public static void  swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sortedArray(int n, int[] arr){
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    System.out.print("Sorted array: ");
    for(int i = 0 ; i<n ; i++){
      System.err.print(arr[i]+" ");
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms in array : ");
        int n = sc.nextInt();
        
        int arr[] =  new int[n];
        System.out.println("Enter array elements one by one(0 or 1 or 2)...");
        for(int i = 0 ; i<n ; i++){
            int element;
            while (true) {
                element = sc.nextInt();
                if (element == 0 || element == 1 || element == 2) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 0, 1, or 2:");
                }
            }
            arr[i] = element;
        }
        sortedArray(n, arr);
        sc.close();
    }
}
