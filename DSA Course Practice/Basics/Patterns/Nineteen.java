public class Nineteen {
    static void pattern(int n){
        //upper part 
        int star = n ;
        for(int i = 0; i<n ; i++){
            for(int j = star; j>0 ; j--){
                System.out.print("*");
            }
            for( int j = 0; j<2*i;j++){
                System.out.print(" ");
            }
            for(int j = star; j>0 ; j--){
                System.out.print("*");
            }
            star--;
            System.out.println();
        }
        //lower part
        int space = 2*n-2;
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            for( int j = 0; j<space ;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            space-=2;
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
