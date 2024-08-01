public class Ten {
    public static void pattern(int n){
        int count = 1;
        for(int i = 0; i < 2*n-1 ; i++){
            int star = i;
            if(i>n-1){
                star = star - 2*count;
                count++;
            }
            
            for(int j = 0 ; j <= star ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        //another way
        // for(int i = 1; i <= 2*n-1 ; i++){
        //     int star = i;
        //     if(i>n){
        //         star = 2*n-i;
        //     }
            
        //     for(int j = 1 ; j <= star ; j++ ){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
