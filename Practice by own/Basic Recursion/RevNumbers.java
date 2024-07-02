public class RevNumbers {
        static int num(int start,int end){
            System.out.print(end + " ");        
            if(start==end){
                return 0;
            }
            return num(start, end-1);
        }
        public static void main(String[] args) {
            int n =10;
            num(1, n);
        }
    
    }

