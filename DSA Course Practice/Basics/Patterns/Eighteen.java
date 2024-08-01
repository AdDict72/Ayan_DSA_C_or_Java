public class Eighteen {
    static void pattern(int n){
        char start = 'E';
        for(int i = 1; i<=n ; i++){
            char ch = start;
            for(int j = start ; j <= 'E' ; j++){
                System.out.print(ch);
                ch++;
            }
            start--;
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
