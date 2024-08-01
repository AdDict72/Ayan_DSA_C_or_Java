public class Tweleve {
    static void pattern(int n){
        int space = 2*n -2;
        for(int i = 1; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j);
            }
            for(int j = 1 ; j<=space ; j++)
            {
                System.out.print(" ");
            } 
            for(int j = i ; j>0 ; j--){
                System.out.print(j);
            }
            System.out.println();
            space = space - 2;
        }

    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
