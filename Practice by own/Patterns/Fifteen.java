public class Fifteen {
    static void pattern(int n){
        for(int i = n; i>0 ; i--){
            for(char ch = 'A' ;  ch < 'A'+i ; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
