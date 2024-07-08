import java.util.Scanner;
public class Armstrong {
    public static boolean arm(int n){
        int sum = 0;
        int num =n; int k =String.valueOf(num).length();

        while(num > 0){
            int ld = num % 10;
            sum += Math.pow(ld, k); 
            num = num / 10;
        }
        return sum==n? true: false;    
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Input : ");
        int N = sc.nextInt();
 
        if (arm(N)) {
        System.out.println("This is a Armstrong Number.");
        }
        else{
        System.out.println("This is not a Armstrong");
        }
        sc.close();
    }
}
 
 
 
 
 



