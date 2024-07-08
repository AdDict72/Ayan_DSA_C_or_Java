public class Twentyone {
    static void pattern(int n){
        for(int i = 1; i<=n ; i++){
            if(i==1 || i==n ){
                for(int j =0 ; j<n; j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int k = 0 ; k<n-2 ; k++ ){
                    System.out.print(" ");
                }
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
