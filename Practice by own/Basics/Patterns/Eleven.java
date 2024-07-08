public class Eleven {
    static void pattern(int n){
        // for(int i = 1; i<=n ; i++){
        //     int row = i;
        //     if(row%2==0){
        //         for(int j = 1 ; j<=row ; j++){
        //             if (j%2==0) {
        //                 System.out.print("1");
        //             }
        //             else{
        //                 System.out.print("0");
        //             }
        //         }
        //     }
        //     else{
        //         for(int k =1 ; k<=i ; k++){
        //             if(k%2==0){
        //                 System.out.print("0");
        //             }
        //             else{
        //                 System.out.print("1");
        //             }
        //         }
        //     }
            //Another Way
            int start = 1;
            for(int i=1; i<=n ; i++){
                if(i%2==0) start=0;
                else start =1;

                for(int j = 0 ; j<i ; j++){
                    System.out.print(start);
                    start=1-start;
                }

               System.out.println(); 
            }
        }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
