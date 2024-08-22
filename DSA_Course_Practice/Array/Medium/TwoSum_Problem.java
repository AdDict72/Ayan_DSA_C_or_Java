// Problem Statement: Given an array of integers arr[] and an integer target.
// 1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
// 2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.
// Note: You are not allowed to use the same element twice. Example: If the target is equal to 6 and num[1] = 3, then nums[1] + nums[1] = target is not a solution.

import java.util.Scanner;
class TwoSum_Problem {

    public static String twoSum(int n, int arr[], int target){
        for(int i = 0; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
               if (arr[i]+arr[j]==target) {
                return "YES";
               }
            }
        }
        return "NO";
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

        System.out.println("Enter the target : ");
        int target = sc.nextInt();

        String a = twoSum(n, arr, target);
        System.out.println("Answer for variant 1: " + a);
        sc.close();
    }
}