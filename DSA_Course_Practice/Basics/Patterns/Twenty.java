public class Twenty {
    static void pattern(int n){
        int space = 2*(n-1);
        for(int i = 1; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            for(int j=0 ; j<space ; j++){
                System.out.print(" ");
                
            }
            for(int j =1 ; j<=i; j++){
                System.out.print("*");
            }
            space = space-2;
            System.out.println();
        }
        for(int i = n ; i>1 ; i--){
            space = space+2;
            for(int j = 1 ; j<i; j++){
                System.out.print("*");
            }
            for(int j = 0 ; j<=space+1 ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
