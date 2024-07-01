import java.util.Scanner;

public class IsPrime {
    public static void prime(int num){
        int n = num;
        for(int i = 2 ; i<n; i++){
            if(n%i==0){
                System.out.println(n+" is not prime number.");
                return;
            }
        }
        if (n%1==0 && n%n==0) {
            System.out.println(n+" is a prime number.");
            return;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intput: ");
        int N = sc.nextInt();
        prime(N);
        sc.close();
    }
}
