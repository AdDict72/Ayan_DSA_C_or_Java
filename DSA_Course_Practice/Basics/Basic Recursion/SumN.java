public class SumN {
        static void add(int i,int sum){
            if(i<1){
                System.out.println(sum);
                return;
            }		
            add(i-1, sum+i);
        }
        public static void main(String[] args) {
            int n = 4;
            add(n,0);
        }
    }

