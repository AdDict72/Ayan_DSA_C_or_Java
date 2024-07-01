import java.util.Scanner;

public class AllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        int N = sc.nextInt();
        
        System.out.println("The Divisiors are : ");
        for(int i = 1; i <= N; i++){
            if(N%i==0){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
