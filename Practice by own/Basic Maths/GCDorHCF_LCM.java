import java.util.Scanner;

public class GCDorHCF_LCM {
    static int GCD(int n1,int n2){
        int gcd = 1;
        for(int i = 1; i<=Math.min(n1, n2);i++){
            if(n1%i == 0 && n2%i==0){
                gcd = i;
            }
        }
        return gcd;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n1 : ");
        int n1 = sc.nextInt();
        System.out.println("Input n2 : ");
        int n2 = sc.nextInt();

        int gcd = GCD(n1, n2);
        int lcm = (n1*n2)/gcd;

        System.out.println("GCD is : "+gcd);
        System.out.println("LCM is : "+lcm); 
        sc.close();     
    }
}
