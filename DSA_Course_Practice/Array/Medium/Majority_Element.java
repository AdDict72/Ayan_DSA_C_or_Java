/*
  Problem Statement: Given an array of N integers, 
  write a program to return an element that occurs more than N/2 times in the given array.
  You may consider that such an element always exists in the array.
*/

 import java.util.Scanner;
public class Majority_Element {
    public static int Majority(int n, int[] arr){
        for(int i=0 ; i<n ;i++){
            int count = 0;
            for(int j=0 ; j<n ; j++){
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count>(n/2)){
                return arr[i];
            }
        }   
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms in array : ");
        int n = sc.nextInt();
        
        int arr[] =  new int[n];
        System.out.println("Enter array elements one by one...");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int a = Majority(n, arr);
        System.out.println("Majority element is : " + a);
        sc.close();
    }
}