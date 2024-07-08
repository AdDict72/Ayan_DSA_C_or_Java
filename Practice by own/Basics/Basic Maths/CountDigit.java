import java.util.Scanner;

class CountDigit{
    public static int count(int n){
        int c=0;
        int num = n;
        for(int i = 0 ; num > 0 ;i++){
            num = num/10;
            c++;
        }
        return c;      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");        
        int N = sc.nextInt();

        int count = count(N);
        System.out.println("Digit count is : " + count); 
        sc.close();
    }
}