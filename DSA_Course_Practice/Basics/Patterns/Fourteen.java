public class Fourteen {
    static void pattern(int n){
        for(int i = 1; i<=n ; i++){
            for(char ch = 'A'; ch < 'A'+i ; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n = 6;
        pattern(n);
    }
}
