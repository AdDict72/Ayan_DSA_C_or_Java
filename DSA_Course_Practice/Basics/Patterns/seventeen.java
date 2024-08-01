public class seventeen {
        static void pattern(int n){
            for(int i = 1; i<=n ; i++){
                for(int j=1 ; j<=n-i ; j++){
                    System.out.print(" ");
                }
                char ch = 'A';
                for(int j=1 ; j <= 2*i-1 ; j++ ){
                    if(j<i){
                       System.out.print(ch); 
                       ch++;
                    }
                    else{
                        System.out.print(ch);
                        ch--;
                        }
                }

                System.out.println();
            }
    
        }
        public static void main(String[] args) {
            int n = 4;
            pattern(n);
        }
    }
